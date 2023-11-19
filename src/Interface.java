
interface A3{
	
	int age=22;             //variables inside the interface is always final and static
	String area="Calicut";
	
	
	void show();
	void config();
}


class B3 implements A3{
	public void show() {
		System.out.println("Hi");
	}
    public void config() {
	     System.out.println("Hello");}
     }

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 obj= new B3();
		obj.show();
		obj.config();
		
	
		System.out.println(A3.age);//static variables can be accessed by its classname
	}

}
