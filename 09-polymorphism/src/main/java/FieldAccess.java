/**
 * 1.0v created by wujf on 2020-12-29
 */
class Super {
  public int field = 0;

  public int getField() {
    return field;
  }
}

class Sub extends Super {
  public int field = 1;

  @Override
  public int getField() {
    return field;
  }

  public int getSuperField() {
    return super.getField();
  }
}

public class FieldAccess {
  public static void main(String[] args) {
    Super sup = new Sub();
    System.out.println("sup.field:" + sup.field + ",sup.getField():" + sup.getField());
    Sub sub = new Sub();
    System.out.println("sub.field:" + sub.field + ",sup.getField():" + sup.getField()
            + ",sub.getSuperField():" + sub.getSuperField());


  }
}
