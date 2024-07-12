package Assignments;

public class A123_stringBuffer {

	public static void main(String[] args) {

		StringBuffer sb= new StringBuffer("Surya");
		
		sb.append(" Kamal"); //joining 2 string
		System.out.println(sb);
		
		sb.insert(11, " Mandal"); //inserting a string in a specific place
		System.out.println(sb);
		
		sb.replace(0, 5, "Subhro"); //replacing with a string value
		System.out.println(sb);
		
		System.out.println(sb.delete(12, 19)); //deleting
		
		System.out.println(sb.reverse()); //reversing
		
		System.out.println(sb.charAt(6));
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		StringBuffer sb1= new StringBuffer("Surya");
		System.out.println(sb1.substring(0)); //printing the value from a specific value
		System.out.println(sb1.subSequence(0, 4)); //printing the value from a specific value to  specific range
	}
}