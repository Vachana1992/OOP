abstract class Car{
	
	public abstract void Drive();
	public abstract void fly();
	
   public void PlayMusic() {
		System.out.println("playing music");
	}
   
  }

abstract class Wagonr extends Car{
	   
	public void Drive() {
		System.out.println("Driving..");
	}
}

class sumo extends Wagonr{                    //concrete class
	public void fly() {
		System.out.println("Flying");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj= new sumo();
		obj.Drive();
		obj.PlayMusic();
		obj.fly();
		

	}

}
