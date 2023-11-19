class Computer{
	
	
	public void playMusic() {
		System.out.println("Play music");
	}
	
	public String getPen(int  cost) {
		
		if(cost>=10) 
		{
			return "Pen";}
		else {
		return "nothing";}
		
		
	}
}





public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer obj= new Computer();
		obj.playMusic();
		String pen= obj.getPen(0);
		System.out.println(pen);
	}

}
