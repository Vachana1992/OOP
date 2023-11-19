import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class oop1 {
	
	
	public static void main(String[] args) {
		
		int yNum=5;
		
		int[] mynum = {1,2,3,4};
		
		
		for(int i:mynum) {
			if(i%2==0) {
				System.out.println(i);
				break;
			}
			
			
		}
		
		ArrayList<String> num=new ArrayList<String>();
		num.add("abc");
		num.add("xyz");
		
		
		for(String num1:num) {
			System.out.println(num1.contains("a"));
		}
		
		String[] name= {"ab","cd","ef"};
		List<String> namelist= Arrays.asList(name);
		for(String names:namelist) {
			
			System.out.println(names);
		}
		
		
		String s1= "Vachana";
		String s2="Vachana";
		System.out.println(s1 + s2);
		
		String s3= new String("Welcome to java");
		String[] words=s3.split("to");
		
		for(String word:words) {
			System.out.println(word);
		}
		System.out.println(words[1].trim());
		
		for(int i=0;i<s3.length();i++) {
			System.out.println(s3.charAt(i));
		}
		
		for(int i=s3.length()-1;i>=0;i--) {
			System.out.println(s3.charAt(i));
		}
	    
		
	}
	

} 
