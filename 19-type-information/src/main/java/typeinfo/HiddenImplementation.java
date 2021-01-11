package typeinfo;

import typeinfo.interfacea.A;
import typeinfo.interfacea.HiddenC;

import java.lang.reflect.Method;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class HiddenImplementation {
   static void callHiddenMethod(Object a,String methodName) throws Exception{
    Method g = a.getClass().getDeclaredMethod(methodName);
    g.setAccessible(true);
    g.invoke(a);

  }
  public static void main(String[] args) throws Exception {
    A a = HiddenC.makeA();
    a.f();
    System.out.println(a.getClass().getName());
    // Compile error: cannot find symbol 'C':
        /* if(a instanceof C) {
            C c = (C)a;
            c.g();
        } */
// Oops! Reflection still allows us to call g():
    callHiddenMethod(a, "g");
    // And even less accessible methods!
    callHiddenMethod(a, "u");
    callHiddenMethod(a, "v");
    callHiddenMethod(a, "w");
  }
}
