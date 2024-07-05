package Assignments;

public class A92_matchesString_prog {

	public static void main(String[] args) {

		String name="SuryaKamalMandal";
		
		boolean check= name.matches("(.*)u(.*)");
		System.out.println(check);
	}
}