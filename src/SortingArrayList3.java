import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	int age;
	String name;
	

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}


public class SortingArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> com= new Comparator<Student>() {

			
			public int compare(Student i, Student j) {
				if(i.age>j.age)
				   return 1;
				else
					return -1;
			}
			
		};
		
		List<Student> studs= new ArrayList<>();
		studs.add(new Student(31,"Vachana"));
		studs.add(new Student(27,"Aksh"));
		studs.add(new Student(35,"SaiKrishnan"));
		studs.add(new Student(29,"aswathi"));
		studs.add(new Student(30,"Anusm"));
		
		for(Student s:studs) {
			System.out.println(s);
		}
		
		Collections.sort(studs,com);
		System.out.println();
		System.out.println(studs);
		System.out.println();
		for(Student s:studs) {
			System.out.println(s);
		}

	}

}
