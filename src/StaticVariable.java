class Mobile{
	String brand;
	int price;
	static String name;//This variable is shared by all objects and called by its classname instead of objects name(line 26 and 32)
	
	public void show() {
		
		System.out.println(brand+" "+price+" "+name);
	}
	
}




public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj= new Mobile();
		obj.brand="Apple";
		obj.price=1500;
		//obj.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		Mobile obj1=new Mobile();
		obj1.brand="Samsung";
		obj1.price=1900;
		//obj1.name="SmartPhone";
		Mobile.name="SmartPhone";
		
//		System.out.println(obj.brand+" "+obj.price+" "+obj.name);
//		System.out.println(obj1.brand+" "+obj1.price+" "+obj1.name);
		
		obj.show();
		obj1.show();

	}

}
