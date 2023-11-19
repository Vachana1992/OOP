class Students{
	
	int rollno;
	String name;
	int marks;
}


public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students s1=new Students();
		s1.rollno=1;
		s1.name="Maya";
		s1.marks=67;
		
		Students s2=new Students();
		s2.rollno=2;
		s2.name="sita";
		s2.marks=59;
		
		Students s3=new Students();
		s3.rollno=3;
		s3.name="kiya";
		s3.marks=88;
		
		int total=0;
		Students students[]= new Students[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		System.out.println("Marks    Name");
		for(int i=0;i<students.length;i++) {
			
			System.out.println(students[i].marks+"       "+students[i].name);
			total += students[i].marks;
		}
		System.out.println("Total marks= "+total);
//*************************************************************************		
		System.out.println("Enhanced for loop");
		System.out.println("Marks   RollNo.   Name");
		for(Students stud:students) {
			System.out.println(stud.marks+"     "+stud.rollno+"      "+stud.name);
		}
		
		
		
		
		
		
		
		
		
		//array.length concept
		int[] num=new int[6];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	
}


