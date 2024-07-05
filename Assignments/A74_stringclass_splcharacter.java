package Assignments;
import java.util.Arrays;

public class A74_stringclass_splcharacter {
	static int count_numeric= 0;
	static int count_alphabets= 0;
	static int count_space= 0;
	public static void main(String[] args) {
		
		String name= "Surya Kamal 951 753 &$@)(";
		String name1= name.toLowerCase();
		
		char ch[]= name1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<name1.length();i++) {
			boolean res= Character.isDigit(ch[i]);
			if(res==true) {
				count_numeric++;
			}
			
			boolean res1= Character.isLetter(ch[i]);
			if(res1==true) {
				count_alphabets++;
			}
			
			boolean res2= Character.isSpaceChar(ch[i]);
			
			if(res2==true) {
				count_space++;
			}
			
		}
		int specialchar= name1.length()-(count_numeric+count_alphabets+count_space);
		System.out.println("Special Characters present are--> "+specialchar);
	}
}