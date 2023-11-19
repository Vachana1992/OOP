import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num= new ArrayList<Integer>();
		num.add(45);
		num.add(21);
		num.add(49);
		num.add(23);
		
		
		Collections.sort(num);
		System.out.println(num);
		System.out.println();
		
		for(int n:num) {
			System.out.println(n);
		}

	}

}
