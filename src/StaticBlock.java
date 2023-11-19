class mobile1{
	
	String brand;
	int price;
	static String name;
	
	//Constructor is a method to intialize objects
	public mobile1(){
		brand="apple";
	    price=200;
	    
	}
	//Static method
	static
	{
		name="phone";
		System.out.println("in static block");
	}
	
	public  void show() {
		System.out.println(brand+" "+price+" "+name );
	}
}
public class StaticBlock {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		
//		mobile1 m1=new mobile1();
//		mobile1 m2=new mobile1();
//		m1.show();
//		m2.show();
		//from the above we can see static method will call only once for more than one objects
	

		Class.forName("mobile");//we can call a class by Class.forName method
		                       //without creating the object
		//in this case static method will call.
		//because class loads first and then only the objects intialized
		//so when the class loaded static method will be called
		// that is why in prev case also we can see static method calls first then the objects
	
	  
	}

}
