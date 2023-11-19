
public class Threadss2AnonymousInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable obj= new Runnable() {
			
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
		};
		
		Runnable obj1= new Runnable() {
			
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
		};
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();

	}

}
