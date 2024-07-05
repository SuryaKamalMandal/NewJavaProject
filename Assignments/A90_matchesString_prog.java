package Assignments;

public class A90_matchesString_prog {

	public static void main(String[] args) {

		String name="SuryaKamalMandal";
		
		boolean check= name.matches("k(.*)");
		System.out.println(check);
	}
}