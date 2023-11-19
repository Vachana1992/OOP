import java.util.Scanner;

public class OOP2Methods {

	public static void main(StringBasics[] args) {
		// TODO Auto-generated method stub

		
		
		
		int a= 9;
		//int result=a++;
		int result1=++a;
		//System.out.println("1st result="+result);
		System.out.println("2nd result="+result1);
		
		int b=8;
		if(b>10&&b<=20)
			System.out.println("Hello");
		System.out.println("Bye");
		
		
		
		OOP2Methods oop= new OOP2Methods();
		int s= oop.add();
		System.out.println(s);
		
		
	}
	
	public int add() {
		
		Scanner myObj= new Scanner(System.in);
		System.out.println("enter number");
		int num1= myObj.nextInt();
		System.out.println("enter number");
		int num2= myObj.nextInt();
		int sum = num1+num2;
		return sum;
		
	}

}
