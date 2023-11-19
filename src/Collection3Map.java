import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Collection3Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> students=new HashMap<String,Integer>();
		
		students.put("Vachana", 35);
		students.put("Sai", 44);
		students.put("Akshara", 38);
		students.put("Manu", 43);
		students.put("Nandu", 32);
		
		System.out.println(students);
		System.out.println(students.keySet());
		System.out.println("Mark of Vachana: "+students.get("Vachana"));
		System.out.println();
		
		System.out.println("Mark list");
		System.out.println("----------------");
		for(String stud:students.keySet()) {
			System.out.println(stud+": "+students.get(stud));
		}
		
		System.out.println();
	
		//To achieve synchronization we can replace HashMap with HashTable
		
		System.out.println("explain hashtable");
		System.out.println("--------------------");
Map<String,Integer> students1=new Hashtable<String,Integer>();
		
		students1.put("Vachana", 93);
		students1.put("Sai", 87);
		students1.put("Akshara", 78);
		students1.put("Manu", 66);
		students1.put("Nandu", 78);
		
		System.out.println(students1);
		System.out.println(students1.keySet());
		System.out.println("Mark of Vachana: "+students1.get("Vachana"));
		System.out.println();
		
		System.out.println("Mark list");
		System.out.println("----------------");
		for(String stud1:students.keySet()) {
			System.out.println(stud1+": "+students1.get(stud1));
		}
		

	}

}
