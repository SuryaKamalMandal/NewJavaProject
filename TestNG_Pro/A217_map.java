package TestNG_Pro;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class A217_map {

	public static void main(String[] args) {
		
		Map<String, Character> m= new HashMap<String, Character>();
		m.put("Surya", 'S');
		m.put("Kamal", 'K');
		m.put("Mandal", 'M');
		
		System.out.println(m);
		
		Map<String, Character> m1= new HashMap<String, Character>();
		m1.put("Rahul", 'R');
		m1.put("Anirvan", 'A');
		m1.put("Selenium", 'S');
		
		for(String s1:m.keySet()) {
			System.out.println(s1);
		}
		for(Character i1:m.values()) {
			System.out.println(i1);
		}
		for(Entry<String, Character> e1:m1.entrySet()) {
			System.out.println(e1);
		}
		
		Iterator<Entry<String, Character>> ee= m1.entrySet().iterator();
		while(ee.hasNext()) {
			System.out.println("----------");
			System.out.println(ee.next());
		}
	}
}