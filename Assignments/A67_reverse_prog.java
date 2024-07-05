package Assignments;

public class A67_reverse_prog {

	public static void main(String[] args) {
		
		String name="SuryaKamalMandal";
		String new_name= name.toLowerCase();
		String reverse="";
		
		for(int i=new_name.length()-1;i>=0;i--) {
			
			char ch1= new_name.charAt(i);
			reverse=reverse+ch1;
		}
		System.out.println(reverse);
	}
}