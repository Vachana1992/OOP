enum status1{
	Running,pending,failed,success;
}
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		status1 s= status1.Running;
		
		if(s==status1.Running)
			System.out.println("All Good");
		else if(s==status1.pending)
			System.out.println("Please wait");
		else if(s==status1.failed)
			System.out.println("Try again");
		else
			System.out.println("Success");
		
		
		status1 ss= status1.pending;
		switch(ss)
		{
		case Running:System.out.println("All Good in switch");
			break;
		case pending:System.out.println("Please wait in switch");
			break;
		case failed:System.out.println("Try again in switch");
			break;
		case success:System.out.println("Success in switch");
			break;
		
		}
	}

}
