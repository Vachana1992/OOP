class Akl{
	public void show(){
	try {
		Class.forName("Demo");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

//the above code can be written as

class akl1  {
	
	public void show1() throws ClassNotFoundException{
		
	
	Class.forName("calc");
	
}

public class Exceptions2ThrowsKeyword {
	
	class Demo{
		
		static {
			System.out.println("Hi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Akl ob=new Akl();
		ob.show();
		
		
		
		akl1 obj=new akl1();
		try {
			obj.show1();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
			
		

	}

}}

