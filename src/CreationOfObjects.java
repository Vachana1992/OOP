
class calculator { 
		
	int a;   //what object knows
	
	public int add(int num1,int num2) //what object do
	{
		return num1+num2;
	}
}


public class CreationOfObjects {

	public static void main(StringBasics[] args) {
		
        int n1=2;
		int n2=3;
		calculator calc=new calculator(); //calc is reference variable for Calculator class
		int result= calc.add(n1,n2);
		System.out.println(result);
	}

}
