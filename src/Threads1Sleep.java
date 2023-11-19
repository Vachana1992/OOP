//print one Hi then One Hello

class hjkl5 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hello");  
		try {
			Thread.sleep(20);      // Hello will be wait for some milliseconds, in that time class B runs as both the classes are threads now and running parallely
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class hjkl6 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class Threads1Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hjkl5 ob1=new hjkl5();
		hjkl6 ob2= new hjkl6();
		
		ob1.start();
		ob2.start();

	}

}
