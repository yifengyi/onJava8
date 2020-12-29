/**
 * 1.0v created by wujf on 2020-12-29
 */
interface Bob1{
  default void bob(){
    System.out.println("Bob1::bob");
  }
}
interface Bob2{
  default void bob(){
    System.out.println("Bob2::bob");
  }
}

/*
error: class Bob inherits unrelated defaults
for bob() from types Bob1 and Bob2
class Bob implements Bob1,Bob2{

}*/
interface Sam1{
  default  void sam(){
    System.out.println("Sam1::sam");
  }
}
interface Sam2{
  default  void sam(int i){
    System.out.println(i * 2);
  }
}
class Sam implements Sam1,Sam2{}
interface Max1{
  default void max(){
    System.out.println("Max1::max");
  }
}
interface Max2{
  default int max(){
    return 47;
  }
}
/* Produces:
         error: types Max2 and Max1 are imcompatible;
         both define max(), but with unrelated return types
class Max implements Max1,Max2{}*/
interface Jim1{
  default void jim(){
    System.out.println("Jim1::jim");
  }
}
interface Jim2{
  default void jim(){
    System.out.println("Jim2::jim");
  }
}
public class Jim implements Jim1,Jim2{
  @Override
  public void jim() {
    Jim2.super.jim();
  }

  public static void main(String[] args) {
    new Jim().jim();
  }
}
