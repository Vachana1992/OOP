class Up
{
	public void show1() {
		System.out.println("In Up");
	}
}

class Down extends Up
{
	public void show2() {
		System.out.println("In Down");
	}
}


public class UpCastingDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Up obj1=new Down();
		obj1.show1();
		//here we are creating an object of class 'Down' for reference variable of its parent class 'Up'
		//So that we cannot access the method inside class 'Down'
		//Implicitly it is upcasting because this is saying
		//Up obj1= (Up) new Down();
		// it is creating an object of child class and casting to the parent class hence it caled upcasting
		
		Down obj2= (Down) obj1;//here we are downcasting obj1 to child class
		obj2.show2();
		

	}

}
