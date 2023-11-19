import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection<Integer> num= new ArrayList();
		num.add(7);
		num.add(8);
		num.add(9);
		System.out.println(num);
	    
		
		//print theses values single
		Collection<Integer> nums=new ArrayList<Integer>();
		nums.add(2);
		nums.add(7);
		nums.add(6);
		nums.add(6); //List support duplicate values
		
		for(int n:nums) {
		   System.out.println(n);
		}
		
		
		//collection will not support indexes 
		//to use indexes we need List
		
		List<Integer> num1= new ArrayList<Integer>();
		num1.add(2);
		num1.add(3);
		num1.add(4);
		
		System.out.println(num1.get(1));
		
	}

}
