import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> num= new HashSet<Integer>();
		num.add(62);
		num.add(47);
		num.add(94);
		num.add(14);
		num.add(38);
		System.out.println("List of numbers in set");
		for(int n:num) {
			System.out.println(n);//Set support only unique values (No duplicates)
		}
		
		//Collection and set will not support indexes
		//print the values in a set in a sorted order
		
		Collection<Integer> num1= new TreeSet<Integer>();
		num1.add(62);
		num1.add(47);
		num1.add(94);
		num1.add(14);
		num1.add(38);
		System.out.println("List of numbers in set  sorted");
		for(int n1:num1) {
			System.out.println(n1);
		}
		
		
		//Iterator method
		System.out.println("Iterator method");
		Collection<Integer> num2= new HashSet<Integer>();
		num2.add(62);
		num2.add(47);
		num2.add(94);
		num2.add(14);
		num2.add(38);
		
		Iterator<Integer> it= num2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
