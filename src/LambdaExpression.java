interface G1{
	void show();
	
}

interface G2{
	void config();
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G1 obj= new G1() {
			public void show() {
				System.out.println("in show");
			}
		};
		obj.show();
		
		
		//by using lambda expression we can write the method like this
		G2 ob= ()-> System.out.println("in config");
		ob.config();
		
	}

}
