class hjkl3 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hello");
		}
	}
}

class hjkl4 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hi");
		}
	}
}
public class Threads1Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hjkl3 ob1= new hjkl3();
		hjkl4 ob2= new hjkl4();
		
		System.out.println(ob1.getPriority());
		
		ob2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(ob2.getPriority());
		
		ob1.start();
		ob2.start();

	}

}
