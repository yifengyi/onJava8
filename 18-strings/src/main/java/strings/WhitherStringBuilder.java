package strings;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class WhitherStringBuilder {
  public String implicit(String[] fields){
    String res = "";
    for (String s : fields) {
      res +=s;
    }
    return res;
  }
  public String explicit(String[] fields){
    StringBuilder sb = new StringBuilder();
    for (String field : fields) {
      sb.append(field);
    }
    return sb.toString();
  }
}
