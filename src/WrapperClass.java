
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=7;
		
		Integer num2= num;      //autoboxing--primitive datadype sores ino an object
		//It can write as Integer num2= new Integer(num);
		
		
		int num3= num2;  //auto-Unboxing-- changing to primitive data type
		
		
		String str="12";
		int num4=Integer.parseInt(str);
		System.out.println(num4*2);
	}

}
