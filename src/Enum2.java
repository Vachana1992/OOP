enum Laptop1{
	Macbook(2000),XPS(2200),Surface,Thinkpad(1200);
	
	private int price;
	
	

	private Laptop1() {
		price=1700;
	}

	private Laptop1(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}


public class Enum2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop1 lap=Laptop1.Macbook;
		System.out.println(lap+" "+lap.getPrice());
		
		for(Laptop1 l:Laptop1.values()) {
			System.out.println(l+"  " +l.getPrice());
		}

	}

}
