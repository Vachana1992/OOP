class C2{
	
	public C2() {
		
		System.out.println("in C");
	}
	
	public C2(int a) {
		
		System.out.println("in C int");
	}
}

class D2 extends C2{
	
	public D2()    

	{
		System.out.println("in D");
	}
	
	public D2(int a)
	{
		   super(a); 
		 //Here we have to call the parameteised constructor of the super class/parent class hence we explicitly use super method with arg
		 //every constructor has a super method which will call the constructor of parent classs
		 //if super method is not mentioned like default constructor of D1 then we will call the default constructor of the parent class here is default constructor of C1
		System.out.println("in D int");
	}
	
}
public class SuperMethod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		D2 obj=new D2(6);
	}

}
