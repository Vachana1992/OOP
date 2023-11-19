import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student1 implements Comparable<Student1>{
	
	int age;
	String name;
	

	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student1 that) {
		
			if(this.age>that.age)
			   return 1;
			else
				return -1;
		
	}
	
	
}

public class SortingArrayList3Comparable {

	public static void main(String[] args) {
//Comparator<Student1> com= new Comparator<Student1>() {
//
//			
//			public int compare(Student1 i, Student1 j) {
//				if(i.age>j.age)
//				   return 1;
//				else
//					return -1;
//			}
//			
//		};
		
		List<Student1> studs= new ArrayList<>();
		studs.add(new Student1(31,"Vachana"));
		studs.add(new Student1(27,"Aksh"));
		studs.add(new Student1(35,"SaiKrishnan"));
		studs.add(new Student1(29,"aswathi"));
		studs.add(new Student1(30,"Anusm"));
		
		for(Student1 s:studs) {
			System.out.println(s);
		}
		
		Collections.sort(studs);
		System.out.println();
		
		
		System.out.println(studs);
		
		System.out.println();
		for(Student1 s:studs) {
			System.out.println(s);
		}


	}

}
