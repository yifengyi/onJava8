package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
public class Parcel7 {
  public Contents contents(){
    return new Contents() {
      private int i = 11;
      @Override
      public int value() {
        return i;
      }
    };
  }

  public static void main(String[] args) {
    Parcel7 p = new Parcel7();
    Contents s = p.contents();
  }
}
