class bnm{
	 int num=6;
	 
	 public void show() 
	 {
		 System.out.println("in show");
		
	 }
	
	
	class klo{
		 
		public void config() {
			System.out.println("in config");
		}
	}
	
	
	static class dfg{
		public void sing() {
			System.out.println("singing");
		}
	}
}
public class InnerClass_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bnm obj= new bnm();
		obj.show();
		
		bnm.klo ob= obj.new klo();
		ob.config();
		
		
		bnm.dfg obje= new bnm.dfg();
		obje.sing();
		
	}

}
