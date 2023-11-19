class human3{
	private int age;
	private String name;
	
	public human3() //default constructor
	{
		age=12;
		name="sai";
	}
	
	public human3(int age,String name)//parameterised constructor
	{
		this.age=age;
		this.name=name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}




public class ConstructorMethosoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		human3 h3=new human3();
		System.out.println(h3.getName()+":"+h3.getAge());
		
		
		human3 h4= new human3(18,"Vach");
		System.out.println(h4.getName()+":"+h4.getAge());

	}

}
