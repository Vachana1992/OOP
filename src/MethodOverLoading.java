class Calculator1{
	
	public int add(int n1 , int n2) {
		return n1+n2;
	}
	
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	public String add(String n1,String n2) {
		return n1+n2;
	}
}


public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method overloading:Overloading happens when you have two methods with the same name 
		//but different signatures (or arguments). 
		//In a class we can implement two or more methods with the same name. 
		//Overloaded methods are differentiated based on the number and type of parameter passed as arguments to the methods.
		
		Calculator1 obj= new Calculator1();
		int r1= obj.add(3, 4);
		System.out.println(r1);
		
		int r2=obj.add(2, 8, 6);
		System.out.println(r2);
		
		String r3= obj.add("Hi", " Vachana");
		System.out.println(r3);
		
	}
	
	
	

}
