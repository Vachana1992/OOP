class A1{
	public void show() {
		System.out.println("Hi");
	}
}
public class Innerclass_AnonymousInnercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 obj= new A1() {
			
			public void show()
			{
				System.out.println("Hi is overrided here");
			}
		};
		
		obj.show();

	}

}
