package Assignments;

public class A89_matchesString_prog {

	public static void main(String[] args) {

		String name="SuryaKamalMandal";
		
		boolean check= name.matches("(.*)a");
		System.out.println(check);
	}
}