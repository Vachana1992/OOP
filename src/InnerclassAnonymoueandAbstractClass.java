abstract class A2
{
	public abstract void show();
	public abstract void display();
}

public class InnerclassAnonymoueandAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		A2	obj = new A2() {
			
			public void show() {
				System.out.println("Abstract class in a innerclass");
			}
		
			public void display() {
				System.out.println("Abstract class2 in a innerclass");
			
				
			}
		};
		
		obj.show();
		obj.display();
	}

}
