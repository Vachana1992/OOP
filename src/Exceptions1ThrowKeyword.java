
public class Exceptions1ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=20;
		int j=0;
		
		try {
			j= 18/i; //Here , I dont want tp print zero.here generally the exception will not call because 18/18 is valid. But we need to catch the error. Then we will throw or handle the exception like below.
			if(j==0)
				throw new ArithmeticException("divide by zero.I need to catch te exception anyways");
		}
		catch(ArithmeticException e) {
			j=18/1; //handling exception.
			System.out.println("This is the defeult val "+ e);
		}
		
		System.out.println(j);
	}

}
