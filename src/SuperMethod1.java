class A{
	
	public A()
	{
		System.out.println("in A");
	}
	
}

class B extends A{
	
	public B()
	{
		System.out.println("in B");
	}
	
	public B(int a)
	{
		System.out.println("in B int");
	}
	
}
public class SuperMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj= new B();

	}

}
