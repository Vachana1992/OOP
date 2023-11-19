class Human{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String a) {
		name=a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int n) {
		age=n;
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h1=new Human();
		h1.setName("Vach");
		h1.setAge(12);
		System.out.println(h1.getName()+":"+h1.getAge());

	}

}
