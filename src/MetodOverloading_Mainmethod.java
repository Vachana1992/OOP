
public class MetodOverloading_Mainmethod {

	
//	Overloading the main method
//	---------------------------------------------
//	Yes, we can overload the main method in Java, i.e. we can write more than one public static void main()  method by changing the arguments. If we do so, the program gets compiled without compilation errors.
//
//	But, when we execute this program JVM searches for the main method which is public, static, with return type void, and a String array as an argument and calls it. It never calls main methods with other types as arguments.
//
//	public static int main(String[] args){
//	}
//	Note − If such method is not found, a run time error is generated.
//
//	Example
//	In the following example, we are trying to overload the public static void main() method (by having two main methods with different parameters), one accepts a String array as an argument and the other which accepts an integer array as argument −
//
//	 Live Demo
	
	   public static void main(StringBasics args[]) {
	      System.out.println("main method with String array as arguments");
	   }
	   public static void main(int args[]) {
	      System.out.println("main method with integer array as arguments");
	   }
	
//	Output
//	When we execute this program the main method with integer array as argument is never called.
//
//	main method with String array as arguments
}
