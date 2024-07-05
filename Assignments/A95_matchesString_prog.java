package Assignments;

public class A95_matchesString_prog {

	public static void main(String[] args) {
		
		String name="automation testing";
		
		boolean check= name.matches("(.*)n(.*)");
		System.out.println(check);
	}
}