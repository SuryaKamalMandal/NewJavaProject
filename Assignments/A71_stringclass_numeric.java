package Assignments;

import java.util.Arrays;

public class A71_stringclass_numeric {
	static int count_numeric= 0;
	public static void main(String[] args) {
		
		String name= "SuryaKamal951753";
		String name1= name.toLowerCase();
		
		char ch[]= name1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<name1.length();i++) {
			boolean res= Character.isDigit(ch[i]);
			
			if(res==true) {
				count_numeric++;
			}
		}
		System.out.println("Numeric number present are--> "+count_numeric);
	}
}