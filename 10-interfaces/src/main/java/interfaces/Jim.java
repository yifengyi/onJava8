package interfaces;

/**
 * 1.0v created by wujf on 2020-12-29
 */
interface Bob1{
  default void bob(){
    System.out.println("interfaces.Bob1::bob");
  }
}
interface Bob2{
  default void bob(){
    System.out.println("interfaces.Bob2::bob");
  }
}

/*
error: class Bob inherits unrelated defaults
for bob() from types interfaces.Bob1 and interfaces.Bob2
class Bob implements interfaces.Bob1,interfaces.Bob2{

}*/
interface Sam1{
  default  void sam(){
    System.out.println("interfaces.Sam1::sam");
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
    System.out.println("interfaces.Max1::max");
  }
}
interface Max2{
  default int max(){
    return 47;
  }
}
/* Produces:
         error: types interfaces.Max2 and interfaces.Max1 are imcompatible;
         both define max(), but with unrelated return types
class Max implements interfaces.Max1,interfaces.Max2{}*/
interface Jim1{
  default void jim(){
    System.out.println("interfaces.Jim1::jim");
  }
}
interface Jim2{
  default void jim(){
    System.out.println("interfaces.Jim2::jim");
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
