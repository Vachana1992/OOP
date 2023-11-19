class Abc1{
	int age;
	String name;
	@Override
	public String toString() {
		return "Abc [age=" + age + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc1 obj=new Abc1();
		obj.age=12;
		obj.name="Vachana";
		System.out.println(obj);

	}

}
