package Assignments;

public class A98_string_class_prog {

	public static void main(String[] args) {
		
		String name= "SuryaKamalMandal";
		boolean result= name.equalsIgnoreCase("suryakamalmandal");
		System.out.println(result);
		
		System.out.println(name.endsWith("l"));
		
		String age= "";
		System.out.println(age.isEmpty());
		
		System.out.println(name.repeat(5));	
	}
}