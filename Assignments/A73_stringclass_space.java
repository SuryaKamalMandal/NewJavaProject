package Assignments;
import java.util.Arrays;

public class A73_stringclass_space {
	static int count_space= 0;
	public static void main(String[] args) {
		
		String name= "Surya Kamal 951 753";
		String name1= name.toLowerCase();
		
		char ch[]= name1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<name1.length();i++) {
			boolean res= Character.isSpaceChar(ch[i]);
			
			if(res==true) {
				count_space++;
			}
		}
		System.out.println("Spaces present are--> "+count_space);
	}
}