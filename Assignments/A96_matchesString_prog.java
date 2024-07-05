package Assignments;

public class A96_matchesString_prog {

	public static void main(String[] args) {
		String name= "sasdph";
		String name1= "suryh";
		boolean check= name.matches("s....h");
		boolean check1= name1.matches("s....h");
		
		System.out.println(check);
		System.out.println(check1);
	}
}