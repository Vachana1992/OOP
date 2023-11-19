@FunctionalInterface
interface MLK{
	void show(int i,int j);
}
@FunctionalInterface
interface MLK1{
	void show(int i);
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.
		MLK obj= (int i,int j)->System.out.println("in show"+(i+j));

		obj.show(5,7);
		
		
		//2.
		MLK1 ob= i->System.out.println("Hi"+i);
		ob.show(3);
	}
}
