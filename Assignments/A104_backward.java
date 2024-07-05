package Assignments;
import java.util.ArrayList;
import java.util.ListIterator;

public class A104_backward {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		a1.add("surya"); 
		a1.add("ram");
		a1.add("sam");
		
		ListIterator s= a1.listIterator();
		
		while(s.hasPrevious()) {
			
			System.out.println(s.previous());
		}
	}
}