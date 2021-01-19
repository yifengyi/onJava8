package annotations.database;

/**
 * 1.0v created by wujf on 2021-1-19
 */
@DBTable(name = "MEMBER")
public class Member {

  @SQLString(30)
  private
  String  firstName;
  @SQLString(50)
  private
  String  lastName;
  @SQLInteger
  private
  Integer age;
  @SQLString(value = 30,
          constraints = @Constraints(primaryKey = true))
  private
  String  reference;

  static int memberCount;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Integer getAge() {
    return age;
  }

  public String getReference() {
    return reference;
  }

  @Override
  public String toString() {
    return reference;
  }
}
