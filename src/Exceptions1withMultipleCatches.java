
public class Exceptions1withMultipleCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=18;
		int j=2;
		int k=0;
		
		int[] num= new int[6];
		
		String str=null;
				
		try {
			k=i/j;
			
			System.out.println(num[5]);
			
			System.out.println(str.length());
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
		
		catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}
		
		System.out.println(k);
		System.out.println("Bye");
	}

}
