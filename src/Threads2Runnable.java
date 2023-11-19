class poi1 implements Runnable{
	
	public void run() {
		for(int i=0;i<=10;i++) {
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

class poi2 implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Threads2Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poi1 obj1=new poi1();
		poi2 obj2 =new poi2();
		
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
