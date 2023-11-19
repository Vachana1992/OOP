class human2{
	private int age;
	private String name;
	
	
	public human2() //Constructure is used to intialize objects
	{
		
		age=12;
		name="Vach";
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



public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human2 h1=new human2();
		System.out.println(h1.getName()+": "+h1.getAge());
		
		

	}

}
