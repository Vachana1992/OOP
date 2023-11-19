import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		names.add("abc");
		names.add("afg");
		names.add("hij");
		names.add("klm");
		names.add("mno");
		
		//names.stream().filter(s->s.startsWith("a"));
		
	//names.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));;
		
		//Foreach method elaborate
	
	Consumer<String> com= new Consumer<String>() {

		
		public void accept(String s) {
			
			System.out.println(s);
		}
		
		
	};
	
	names.forEach(com);
	System.out.println();
	
	
	
	//foreach method - making a lambda expn
	
	System.out.println();
	
	Consumer<String> com1= s ->System.out.println(s);
	
	names.forEach(com1);
	System.out.println();
	
	
	
	
	//foreach method - replace com1
	
	System.out.println();
	
	//Consumer<String> com2= s ->System.out.println(s);
	
	names.forEach(s ->System.out.println(s));
	

	}
	
}   



   
	
	
	


