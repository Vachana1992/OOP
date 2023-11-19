class abc8 {

	public void showBelongToThis() {
		
		System.out.println("Hi");
	}
}

class vbn extends abc8{
	@Override						//when you use the override annotation it tells the compiler that we need to overrride the method. If there is any bug it will show then.
	public void showBelongToThis() {
		System.out.println("Hello");
	}
}
public class Annotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc8 a= new vbn();
		a.showBelongToThis();
		
	}

}
