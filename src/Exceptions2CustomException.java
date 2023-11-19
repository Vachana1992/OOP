class VachanaException extends  Exception{
	
	public VachanaException(String msg) {
		super(msg);
	} 
}
public class Exceptions2CustomException {
	
	public static void main(String args[]) {
		
		int i =20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new VachanaException("divide by zero");
		}
		
		catch (VachanaException e) {
			j=18/1;
			System.out.println("This is the def val "+e);
		}
	}

}
