package Assignments;

import java.util.Arrays;

public class A72_stringclass_alphabets {
	static int count_alphabets= 0;
	public static void main(String[] args) {
		String name= "SuryaKamal951753";
		String name1= name.toLowerCase();
		
		char ch[]= name1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<name1.length();i++) {
			boolean res= Character.isLetter(ch[i]);
			
			if(res==true) {
				count_alphabets++;
			}
		}
		System.out.println("Alphabets present are--> "+count_alphabets);
	}
}