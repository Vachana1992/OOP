class hjkl1 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hello");
		}
	}
}

class hjkl2 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hi");
		}
	}
}
public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hjkl1 obj = new hjkl1();
		hjkl2 ob= new hjkl2();
		obj.start();
		ob.start();

	}

}
