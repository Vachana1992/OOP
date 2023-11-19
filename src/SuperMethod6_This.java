//execute both the constructor of D4 
//example of output should be 'in C', 'in D' and  'in D int'
class C4{
	
	public C4() {
		
		System.out.println("in C");
	}
	
	public C4(int a) {
		
		System.out.println("in C int");
	}
}

class D4 extends C4{
	
	public D4()    

	{
		 super();
		System.out.println("in D");
	}
	
	public D4(int a)
	{
		   this(); //this will call the costructor of the same class
		System.out.println("in D int");
	}
}

public class SuperMethod6_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D4 obj=new D4(5);

	}

}
