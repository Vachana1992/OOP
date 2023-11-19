import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList2OwnLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num= new ArrayList<>();
		num.add(45);
		num.add(23);
		num.add(49);
		num.add(12);
		num.add(78);
		
		System.out.println("Sorting the arrey in own Logic");
		System.out.println("Sort the numbers in an acsending order of their last digit");
		System.out.println("-----------------------------------------------------------------");
		
		Comparator<Integer> com=new Comparator<Integer>() 
		{

			public int compare(Integer i, Integer j) {
				
				if(i%10>j%10)
				    return 1;
				else
					return -1;
			}
			
		};
		
		
		Collections.sort(num,com);
		for(int n:num) {
		System.out.println(n);
		}
	}

}
