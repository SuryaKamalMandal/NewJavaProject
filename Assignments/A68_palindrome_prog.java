package Assignments;

public class A68_palindrome_prog {

	public static void main(String[] args) {
		
		String name="SuryaKamal";
		String newname= name.toLowerCase();
		String reverse="";
		
		for(int i=newname.length()-1;i>=0;i--) {
			
			char ch1= newname.charAt(i);
			reverse=reverse+ch1;
		}
		System.out.println(reverse);
		
//		boolean equal= reverse.equals(newname);
//		System.out.println(equal);
		
		if(reverse.equals(newname)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
}