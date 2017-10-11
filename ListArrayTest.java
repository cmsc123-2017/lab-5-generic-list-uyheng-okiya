import junit.framework.TestCase;

public class ListArrayTest extends TestCase {
  public void testArrayAdd() {
    ListArray la = new ListArray();
    String str = new String("Justin");
    Integer two = new Integer(2);

    assertEquals(true, la.add(str));
    assertEquals(true, la.add(two));
  }
 
  public void testArrayRemove() {
    ListArray la = new ListArray();
    String str = new String("Justin");
    Integer two = new Integer(2);
    String str1 = new String("Frank");
    
    la.add(str);
    la.add(two);

    assertEquals(true, la.remove(str));
    assertEquals(true, la.remove(two));
    assertEquals(false, la.remove(str1));
  }
   
  public void testArrayContains() {
    ListArray la = new ListArray();
    String str = new String("Justin");
    Integer two = new Integer(2);
    String str1 = new String("Frank");
    
    la.add(two);
    la.add(str1);
    
    assertEquals(true, la.contains(two));
    assertEquals(true, la.contains(str1));
    assertEquals(false, la.contains(str));
  }
  
  public void testArrayDisplay() {
    ListArray la = new ListArray();
    String str = new String("Justin");
    Integer two = new Integer(2);
    String str1 = new String("Frank");
    
    la.add(str);
    la.add(two);
    la.add(str1);
    
    la.display();
  }
}
