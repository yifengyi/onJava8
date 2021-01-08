package strings;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class DatabaseException extends Exception {
  public DatabaseException(int transactionID,
                           int queryID,String message){
    super(String.format("(t%d,q%d) %s",transactionID,queryID,message));
  }

  public static void main(String[] args) {
    try {
      throw new DatabaseException(3, 7, "Write failed");
    } catch (DatabaseException e) {
      System.out.println(e);
    }
  }
}
