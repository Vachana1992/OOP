interface E1{
	void show();
	void config();
}

interface E2{
	void display();
}

interface E3 extends E2{
	void run();
}

class F4 implements E3,E1{
	public void show() {
		System.out.println("in show");
	}
	public void config() {
		System.out.println("in config");
	}
	public void display() {
		System.out.println("in display");
	}
	public void run() {
		System.out.println("in run");
	}
}


public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		E1 obj = new F4();
		obj.show();
		obj.config();
		
		E3 obj1= new F4(); // here we have to create a new object of class for interface extended to call the methods
		obj1.display();
		obj1.run();
	
		
	}

}
