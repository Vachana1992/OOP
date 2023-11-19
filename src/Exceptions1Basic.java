
public class Exceptions1Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=8;
		int j=0;
		int k=0;
		try {
		k=i/j;
		
		}
		catch (Exception e) {
			System.out.println("Something went wrong"+e);
		}
		System.out.println(k);
		System.out.println("Bye");

		
	}

}
