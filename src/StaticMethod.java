class Mobiles{
	 String brand;
	 int price;
	 static String name;
	
	public static void show(Mobiles ob) {
		System.out.println(ob.brand+" "+ob.price+" "+name);
		//Here we can use only static variable because it is a static method
		//though we can use non-static variable if object reference varialbe (Mobile ob) is passed from the main method
	}
	
}



public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobiles obj= new Mobiles();
		obj.brand="Apple";
		obj.price=1500;
		//obj.name="SmartPhone";
		Mobiles.name="SmartPhone";
		
		Mobiles obj1=new Mobiles();
		obj1.brand="Samsung";
		obj1.price=1900;
		//obj1.name="SmartPhone";
		Mobiles.name="SmartPhone";
		
		
		Mobiles.show(obj);
		Mobiles.show(obj1);
		
		
		

	}

}
