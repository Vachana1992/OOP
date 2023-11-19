class C{
	
	public C() {
		System.out.println("in C");
	}
	
	public C(int a) {
		System.out.println("in C int");
	}
}

class D extends C{
	
	public D()
	{
		System.out.println("in D");
	}
	
	public D(int a)
	{
		System.out.println("in D int");
	}
	
}
public class SuperMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj=new D(6);

	}

}
