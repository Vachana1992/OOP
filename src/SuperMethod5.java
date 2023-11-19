class C3{
	
	public C3() {
		
		System.out.println("in C");
	}
	
	public C3(int a) {
		
		System.out.println("in C int");
	}
}

class D3 extends C3{
	
	public D3()    

	{
		 super(6);
		System.out.println("in D");
	}
	
	public D3(int a)
	{
		   
		System.out.println("in D int");
	}
}
public class SuperMethod5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D3 obj= new D3();

	}

}
