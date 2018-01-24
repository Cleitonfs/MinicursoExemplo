import java.util.Vector;
import java.util.Enumeration;
 
public class EnumerarVetor {
 
  public static void main(String[] args) {
    //create a Vector object
    Vector v = new Vector();
   
    //populate the Vector
    v.add("One");
    v.add("Two");
    v.add("Three");
    v.add("Four");
    v.add("Five");
    v.add("Six");
   
    //Get Enumeration of Vector's elements using elements() method
    Enumeration e = v.elements();
     
    System.out.println("Elements of the Vector are : ");
   
    while(e.hasMoreElements())
      System.out.println(e.nextElement());
  }
}
