abstract class A4{
	public abstract void show() ;
	public abstract void config();
}


abstract class A5{
	public abstract void Display() ;
}


class B4 extends A4{
	public void show() {
		System.out.println("Hi in abstract class");
	}
	public void config() {
		System.out.println("Hello in abstract class");
	}
}

// we can't use multiple abstract classes in a concrete class

//But we can use multiple interfaces in a class
interface A6{
	 void show1() ;
	void config1();
}


interface A7{
	 void Display1() ;
}

class B5 implements A6, A7{
	public void show1() {
		System.out.println("Hi in interface");
	}
	public void config1() {
		System.out.println("Hello in interface");
	}
	
	public void Display1() {
		System.out.println("Display in interface");
	}
}


public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A4 obj=new B4();
		obj.show();
		obj.config();
		
		B5 ob= new B5();
		ob.show1();
		ob.config1();
		ob.Display1();

	}

}
