package validating;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-5
 */

public class CountedListTest {
  private CountedList list;

  @BeforeAll
  static void beforeAllMsg(){
    System.out.println(">>> Starting CountedListTest");
  }
  @AfterAll
  static void afterAllMsg(){
    System.out.println(">>> Finished CountedListTest");
  }
  @BeforeEach
  public void initialize(){
    list = new CountedList();
    System.out.println("Set up for " + list.getId());
    for (int i = 0; i < 3; i++) {
      list.add(Integer.toString(i));
    }
  }
  @AfterEach
  public void cleanup(){
    System.out.println("Cleaning up " + list.getId());
  }

  @Test
  public void insert(){
    System.out.println("Running testInsert()");
    Assertions.assertEquals(list.size(),3);
    list.add(1, "Insert");
    Assertions.assertEquals(list.size(),4);
    Assertions.assertEquals(list.get(1), "Insert");

  }
  @Test
  public void replace(){
    System.out.println("Running testReplace");
    Assertions.assertEquals(list.size(), 3);
    list.set(1, "Replace");
    Assertions.assertEquals(list.size(), 3);
    Assertions.assertEquals(list.get(1),"Replace");
  }

  private void compare(List<String> list, String[] strs) {
    Assertions.assertEquals(list.toArray(new String[0]),strs);
  }
  @Test
  public void order(){
    System.out.println("Running testOrder()");
    compare(list,new String[]{"0","1","2"});
  }
  @Test
  public void remove(){
    System.out.println("Running testRemove()");
    Assertions.assertEquals(list.size(),3);
    list.remove(1);
    Assertions.assertEquals(list.size(),2);
    compare(list,new String[]{"0","1","2"});
  }
  @Test
  public void addAll(){
    System.out.println("Running testAddAll()");
    list.addAll(Arrays.asList("An","African","Swallow"));
    Assertions.assertEquals(list.size(),6);
    compare(list,new String[]{"0","1","2","An","African","Swallow"});
  }
}
