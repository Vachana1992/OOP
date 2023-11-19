import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num= Arrays.asList(2,7,5,4,6);
		
		Stream<Integer> s1=num.stream();
		//s1.forEach(n->System.out.println(n));
		
		Stream<Integer> s2= s1.filter(n->n%2==0);
		//s2.forEach(n1->System.out.println(n1));
		
		Stream<Integer> s3= s2.map(n->n*2);
	   //s3.forEach(n->System.out.println(n));
		
		int result =s3.reduce(0,(c,e)->c+e);
		System.out.println("output from 1st : "+result);
		
		
		//The above steps can be written in one line
		List<Integer> nums= Arrays.asList(2,4,8,1,5,7);
		int result1= nums.stream().filter(n->n%2==0)
		              .map(n->n*2)
		              .reduce(0,(c,e)->c+e);
		System.out.println("output from 2nd : "+result1);
		
		//sort the values in the arraylist
		List<Integer> number= Arrays.asList(6,8,2,3,9,0,1);
		Stream<Integer> sortedNum= number.stream().filter(n->n%2==0)
						.map(n->n*2).sorted();
		sortedNum.forEach(s->System.out.println(s));
						
		

	}

}
