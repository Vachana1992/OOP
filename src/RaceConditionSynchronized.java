class counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class RaceConditionSynchronized {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		counter c= new counter();
		
		Runnable obj=()->{
			for(int i=1;i<=100;i++) {
				
				c.increment();
			}
		};
		
		Runnable obj1=()->{
			for(int i=1;i<=100;i++) {
			     c.increment();
			}
		};

		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
