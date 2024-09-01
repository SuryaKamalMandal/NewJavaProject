package TestNG_Pro;
import java.util.HashMap;
import java.util.Map;

public class A218_map_methods {

	public static void main(String[] args) {
		
		Map<String, Character> m= new HashMap<String, Character>();
		m.put("Surya", 'S');
		m.put("Kamal", 'K');
		m.put("Mandal", 'M');
			
		//m.remove("Surya");
		m.replace("Kamal", 'M');
		m.replace("Mandal", 'M','A');
		m.putIfAbsent("Surya", 'B');
		System.out.println(m);
	}
}