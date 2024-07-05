package Assignments;

public class A91_matchesString_prog {

	public static void main(String[] args) {
		
		String name="SuryaKamalMandal";
		
		boolean check= name.matches("(.*)z(.*)");
		System.out.println(check);
	}
}