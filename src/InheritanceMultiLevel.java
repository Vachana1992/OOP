class J
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
}


class K extends J
{
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}

}


class L extends K
{
	public int div(int a,int b) {
		return a/b;
	}
	

}
public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L obj=new L();
		int r1=obj.add(2, 3);
		int r2=obj.sub(4,2);
		int r3=obj.mul(2, 9);
		int r4=obj.div(6, 2);
		
		System.out.println(r1+", "+r2+", "+r3+", "+r4);
		

	}

}
