/**
 * 1.0v created by wujf on 2020-12-30
 */
public class TestParcel {
  public static void main(String[] args) {
    Parcel4 p = new Parcel4();
    Contents c = p.contents();
    Destination d = p.destination("Tasmania");

    // Paracel4.PContents //私有成员 无法访问
  }
}
