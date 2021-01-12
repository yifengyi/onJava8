package generics;

import java.util.*;

/**
 * 1.0v created by wujf on 2021-1-12
 * Class.getTypeParameters() “返回一个 TypeVariable 对象数组，表示泛型声明中声明的类型参数...”
 */
class Frob {}
class Fnorkle {}
class Quark<Q> {}

class Particle<POSITION, MOMENTUM> {}
public class LostInformation {
  public static void main(String[] args) {
    List<Frob> list = new ArrayList<>();
    Map<Frob, Fnorkle> map = new HashMap<>();
    Quark<Fnorkle> quark = new Quark<>();
    Particle<Long, Double> p = new Particle<>();
    System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
  }
}
