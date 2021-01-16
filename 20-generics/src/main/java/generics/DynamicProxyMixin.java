package generics;

import onjava.Tuple;
import onjava.Tuple2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class MixinProxy implements InvocationHandler{
    Map<String,Object> delegatesByMethod;

    @SuppressWarnings("unchecked")
    MixinProxy(Tuple2<Object,Class<?>>... pairs){
        delegatesByMethod = new HashMap<>();
        for (Tuple2<Object, Class<?>> pair : pairs) {
            for (Method method : pair.a2.getMethods()) {
                String methodName = method.getName();

                if (!delegatesByMethod.containsKey(methodName)) {
                    delegatesByMethod.put(methodName, pair.a1);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);

        return method.invoke(delegate,args);
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(Tuple2 ...pairs){
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i]=(Class) pairs[i].a2;
        }
        ClassLoader cl = pairs[0].a1.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
}
public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                Tuple.tuple(new BasicImp(), Basic.class),
                Tuple.tuple(new TimeStampedImp(),TimeStamped.class),
                Tuple.tuple(new SerialNumberedImp(),SerialNumbered.class)
        );
        Basic b = ((Basic) mixin);
        TimeStamped t = ((TimeStamped) mixin);
        SerialNumbered s = ((SerialNumbered) mixin);

        b.set("Hello");
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
    }
}
