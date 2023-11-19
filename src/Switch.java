import java.util.Scanner;

public class Switch {

	public static void main(StringBasics[] args) {
		// TODO Auto-generated method stub
		
//		Scanner myObj= new Scanner(System.in);
//		System.out.println("enter day");
//		int days= myObj.nextInt();
		int days=2;
		switch(days) {
		
		case 0: System.out.println("Monday");
		break;
		case 1: System.out.println("Tuesday");
		break;
		case 2: System.out.println("wednesday");
		break;
		default: System.out.println("Bye");
		}
		
		
		int i=0;
		while(i<=3) {
			System.out.println("Hi");
			int j=0;
			while(j<3) {
				System.out.println("Hello");
				j++;
			}
			i++;
		}
		
		
		int k=0;
		do
		 {
			System.out.println("dowhile");
			k++;
		}while(k>2);
		
		
		for(int a=0;a<7;a++) {
			System.out.println("Day "+a);
			for(int b=1;b<7;b++) {
				System.out.println("Hours "+(b+8) +" -- " +(b+9));
			}
		}
		
	}

	

}
