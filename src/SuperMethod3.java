class C1{
	
	public C1() {
		
		System.out.println("in C");
	}
	
	public C1(int a) {
		
		System.out.println("in C int");
	}
}

class D1 extends C1{
	
	public D1()        
	{
		System.out.println("in D");
	}
	
	public D1(int a)
	{
		super();     
		System.out.println("in D int");
	}
	
}
public class SuperMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		D1 obj=new D1(6);
		
	}

}
