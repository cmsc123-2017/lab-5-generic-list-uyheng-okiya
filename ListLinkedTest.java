import junit.framework.TestCase;

public class ListLinkedTest extends TestCase {
  public void testLinkedAdd() {
    ListLinked link = new ListLinked();
    
    String kobe = new String("Kobe");
    Float fl = new Float(10.1);
    String pacito = new String("Pacito");
    
    assertEquals(true, link.add(kobe));
    assertEquals(true, link.add(fl));
    assertEquals(true, link.add(pacito));
  }
  
  public void testLinkedRemove() {
    ListLinked link = new ListLinked();
    
    String steph = new String("Steph");
    Float fl = new Float(10.1);
    String pacito = new String("Pacito");
    
    link.add(fl);
    link.add(pacito);
    
    assertEquals(true, link.remove(fl));
    assertEquals(true, link.remove(pacito));
    assertEquals(false, link.remove(steph));
  }
  
  public void testLinkContains() {
    ListLinked link = new ListLinked();
    
    String mike = new String("Mike");
    Float fl = new Float(10.1);
    String pacito = new String("Pacito");
    
    link.add(mike);
    link.add(pacito);
    
    assertEquals(true, link.contains(mike));
    assertEquals(true, link.contains(pacito));
    assertEquals(false, link.contains(fl));
  }
  
  public void testLinkDisplay() {
    ListLinked link = new ListLinked();
    
    String freak = new String("Giannis");
    Float fl = new Float(10.1);
    String pacito = new String("Pacito");
    Integer five = new Integer(5);
    String kobe = new String("Kobe");
    Double db = new Double(12.891);
    
    link.display();
  }
}
