package annotations.database;


/**
 * 1.0v created by wujf on 2021-1-19
 */
public @interface Uniqueness {
  Constraints constraints() default @Constraints(unique = true);

}
