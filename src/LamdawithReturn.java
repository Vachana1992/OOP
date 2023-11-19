@FunctionalInterface
interface HJK{
	int add(int i,int j);
}

interface HJK1{
	int add(int i,int j);
}


public class LamdawithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HJK obj= new HJK() 
		{
			public int add(int i,int j) {
				return (i+j);
			}
		};

		int r1=obj.add(7, 2);
		System.out.println(r1);
		
		
		//with lambda expression
		HJK1 ob= (i,j)-> i+j;
		int r2= ob.add(2, 3);
		System.out.println(r2);
		
		
	}

}
