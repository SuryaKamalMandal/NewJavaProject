package Assignments;

public class A66_String_class {

	public static void main(String[] args) {
		
		String name="SuryaKamal";
		String new_name= name.toLowerCase();
		
		//charAt()
		char char_value= new_name.charAt(2);
		System.out.println(char_value);
		
		//indexOfchar
		int index= new_name.indexOf('y');
		System.out.println(index);
		
		//substring(start index)
		String substring= new_name.substring(1);
		System.out.println(substring);

		//substring(start index,end index)
		String startend= new_name.substring(3, 8);
		System.out.println(startend);
	}
}