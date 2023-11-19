
public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=new String("vach");
		
		System.out.println(name.charAt(1));
		
		String name1="Anna";
		System.out.println(name1.concat("mol"));
		
		String s1="Vachana";
		String s2="Vachana";
		
        System.out.println(s1==s2);//Storing heap address of s1 to s2  in stack m/y
        
        
        //we can use string buffer to change data
        StringBuffer sb= new StringBuffer("Akshara");
        sb.deleteCharAt(2);
        System.out.println(sb);
        String str=sb.toString();
        System.out.println(str);
        
	}

}
