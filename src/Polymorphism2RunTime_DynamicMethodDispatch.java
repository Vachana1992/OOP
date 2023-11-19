class M{
	public void show() {
		System.out.println("In M");
	}
}
class N extends M{
	public void show() {
		System.out.println("In N");
	}
}
class O extends M{
	public void show() {
		System.out.println("In O");
	}
}
public class Polymorphism2RunTime_DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M obj= new M();
		obj.show();
		
		obj=new N();
		obj.show();
		
		obj=new O();
		obj.show();
		
		// which method gonna execute is determine during the run time 
		//Hence this is called runtime polymorphism
		// and achieved this through Dynamic method dispatch

	}

}
