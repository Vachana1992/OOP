import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList2OwnLogic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names= new ArrayList<>();
		names.add("Vachana");
		names.add("Aksh");
		names.add("SaiKrishnan");
		names.add("aswathi");
		names.add("Anusm");
		
	
		
		Collections.sort(names);
		System.out.println(names);
		
		System.out.println("Sort based on length of the names");
		System.out.println("-----------------------------------");
		
		Comparator<String> com = new Comparator<String>() 
		{
            public int compare(String i,String j) {
            	
            	if(i.length()<j.length())
				    return 1;
            	else
            		return -1;
            }

			
         };
         Collections.sort(names,com);
        
 		System.out.println(names);
		
	}

}
