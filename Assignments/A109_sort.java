package Assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A109_sort {

	public static void main(String[] args) {

		List l=new ArrayList();
		l.add(90);
		l.add(80);
		l.add(70);
		l.add(60);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("After Sorting--> "+l);
	}
}