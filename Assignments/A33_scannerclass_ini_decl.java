package Assignments;
import java.util.Scanner;

public class A33_scannerclass_ini_decl {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String s= scan.next();
		byte a= scan.nextByte();
		short b= scan.nextShort();
		int c= scan.nextInt();
		long d= scan.nextLong();
		float e= scan.nextFloat();
		double f= scan.nextDouble();
		boolean g= scan.nextBoolean();
		char h= scan.next().charAt(0);
	}
}