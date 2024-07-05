package Assignments;
import java.util.Scanner;

public class A55_switchcase {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one by one 2 number with which you want to do add,sub,multi & divide");
		int num1= s.nextInt();
		int num2= s.nextInt();
		System.out.println("Now Choose which mathematical solution you want to see");
		System.out.println("1 for add, 2 for sub, 3 for multi & 4 for div");
		int choice= s.nextInt();
		
		switch(choice) {
		
		case 1: {
			int add= num1+num2;
			System.out.println("Addition of First & Second Number is--> "+ add);
			break;
		}
		case 2: {
			int sub= num1-num2;
			System.out.println("Subtaction of First & Second Number is--> "+ sub);
			break;
		}
		case 3: {
			int multi= num1*num2;
			System.out.println("Multiplication of First & Second Number is--> "+ multi);
			break;
		}
		case 4: {
			int div= num1/num2;
			System.out.println("Division of First & Second Number is--> "+ div);
			break;
		}
		default: {
			System.out.println("You have choosen invalid option, Re-run the code again");
		}
	}
}
}