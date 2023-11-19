interface Computer1{
	void code();
}

class Desktop implements Computer1{
	public void code() {
		System.out.println("code, compile,run: Faster");
	}
}


class Laptop implements Computer1{
	public void code() {
		System.out.println("code, compile,run");
	}
}

class Developer{
	public void devApps(Computer1 lap) {
		lap.code();
	}
}


public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev= new Developer();
		Computer1 lap= new Laptop();
		Computer1 desk= new Desktop();
		
		dev.devApps(lap);
		
	}

}
