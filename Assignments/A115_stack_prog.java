package Assignments;
import java.util.Stack;

public class A115_stack_prog {

	public static void main(String[] args) {
//		ArrayList a1= new ArrayList();
		Stack<String> a1= new Stack();
		a1.add("surya");
		a1.add("kamal");
		a1.add("raman");
		System.out.println(a1);
		
		a1.pop();
		System.out.println(a1);
		System.out.println(a1.peek());
		System.out.println(a1.push("mandal"));
		System.out.println(a1);
	}
}