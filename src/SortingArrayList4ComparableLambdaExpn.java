import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 implements Comparable<Student2>{
	
	int age;
	String name;
	

	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student2 that) {
		
			if(this.age>that.age)
			   return 1;
			else
				return -1;
		
	}
	
	
}
public class SortingArrayList4ComparableLambdaExpn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Comparator<Student2> com= (i, j) -> i.age>j.age?1:-1;	
//				if(i.age>j.age)
//				   return 1;
//				else
//					return -1;
//			
	
		
		List<Student2> studs= new ArrayList<>();
		studs.add(new Student2(31,"Vachana"));
		studs.add(new Student2(27,"Aksh"));
		studs.add(new Student2(35,"SaiKrishnan"));
		studs.add(new Student2(29,"aswathi"));
		studs.add(new Student2(30,"Anusm"));
		
		for(Student2 s:studs) {
			System.out.println(s);
		}
		
		Collections.sort(studs);
		System.out.println();
		
		
		System.out.println(studs);
		
		System.out.println();
		for(Student2 s:studs) {
			System.out.println(s);
		}



	}

}
