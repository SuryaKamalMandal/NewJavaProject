package Assignments;
import java.util.ArrayList;

public class A101_collection_methods {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		a1.add("surya"); // using add
		a1.add("ram");
		a1.add("sam");
		a1.add(50);
		System.out.println("All array are--> "+a1);
		System.out.println("Size of arraylist is--> "+a1.size()); //checking size
		
		a1.remove("ram"); //using remove obj
		System.out.println("After removing 1 array--> "+a1);
		
		ArrayList a2= new ArrayList();
		a2.addAll(a1); // using addall
		a2.add("software");
		a2.add("help");
		System.out.println("New Array--> "+a2);
		
		System.out.println(a1.contains("surya")); //using contains obj
		System.out.println(a2.containsAll(a1)); //using containsall
		
		a2.removeAll(a1); // using removeall
		System.out.println("After removing a1 variable array--> "+a2);
		
		a2.clear(); // using clear
		
		System.out.println("After Clearing a2 variable arraylist--> "+a2.isEmpty()); // checking empty or not
	}
}