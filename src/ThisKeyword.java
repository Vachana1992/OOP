class human1{
	
	private int age;
	private String name;
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






public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human1 h1=new human1();
		h1.setAge(20);
		h1.setName("Vach");
		System.out.println(h1.getName()+" :"+h1.getAge());

	}

}
