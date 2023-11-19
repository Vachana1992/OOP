class Calc{
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}


class advCalc extends Calc{
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
}
public class Inheritance {

	public static void main(String args[]) {
		
		advCalc obj=new advCalc();
		int r1=obj.add(2, 3);
		int r2=obj.sub(4,2);
		int r3=obj.mul(2, 9);
		int r4=obj.div(6, 2);
		
		System.out.println(r1+", "+r2+", "+r3+", "+r4);
		
	}
}
