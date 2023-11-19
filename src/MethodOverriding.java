class Calcu
{
	public int add(int a,int b) {
		return a+b;
	}
}

class advCalcu extends Calcu
{
	public int add(int a,int b)
	{
		return a+b+1;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		advCalcu obj=new advCalcu();
		int r1=obj.add(5, 6);
		System.out.println(r1);
		
		//overriding happens when child class have the same method name as the parent class

	}

}
