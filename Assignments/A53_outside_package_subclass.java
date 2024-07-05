package Assignments;
import JavaPro.A53_outsidepackage;

public class A53_outside_package_subclass extends A53_outsidepackage {

	public static void main(String[] args) {
		
		A53_outside_package_subclass as= new A53_outside_package_subclass();
		// the methods are in JavaPro Package, class name is A53_outsidepackage
		as.add();
		as.multi();
	}
}
