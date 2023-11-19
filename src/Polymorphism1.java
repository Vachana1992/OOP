class X{
	public void show() {
		System.out.println("in X");
	}
}

class Y extends X{
	public void show() {
		System.out.println("in Y");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X obj=new Y(); //Here it depends on the object we created
		//we created new Y as the new object that is why show method of class Y is calling
		//X is parent class  so we can create a ref variable of parent class to create the object of child class
		obj.show();
		
		
		
		
	}

}
