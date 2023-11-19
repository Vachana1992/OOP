enum status{
	Running, failed, pending, success;
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		status s= status.success;
		System.out.println(s);
		System.out.println(s.ordinal());
		
		status[] ss= status.values();
		for(status s1:ss) {
			System.out.println(s1+": "+s1.ordinal());
		}
		

	}

}
