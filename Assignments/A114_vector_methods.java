package Assignments;
import java.util.ArrayList;
import java.util.Vector;

public class A114_vector_methods {

	public static void main(String[] args) {
//		ArrayList a1= new ArrayList();
		
		Vector a1= new Vector();
		a1.add("surya");
		a1.add("kamal");
		a1.add("mandal");
		
		System.out.println(a1.capacity());
		
		System.out.println(a1);
		
		a1.addElement("raman");
		System.out.println(a1);
		
		System.out.println(a1.firstElement());
		System.out.println(a1.lastElement());
		
		a1.removeElement("raman");
		System.out.println(a1);
		a1.removeElementAt(2);
		System.out.println(a1);
		
		a1.removeAllElements();
		System.out.println(a1);
	}
}