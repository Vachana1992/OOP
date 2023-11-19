
public class Arrays {

	public static void main(StringBasics[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {1,2,3,4};  //we can also write int num[]
		for(int n1:num) {
			System.out.println(n1);}
			
			int[] num1 =new int[4];
			num1[0]=2;
			num1[1]=6;
			num[3]=9;
			
			
			
			//mutidiamensional arrays
			int[][] nums= new int[3][4];
			nums[0][0]=1;
			nums[0][1]=2;
			nums[0][2]=3;
			nums[0][3]=4;
			
			
			//assigning random values to the multi diamensional array and print it
			int[][] nums1=new int[3][4];
			
			for(int i=0;i<=2;i++) {
				for(int j=0;j<=3;j++) {
					nums1[i][j]=(int)(Math.random()*10);
					
				}
				}
			for(int i=0;i<=2;i++) {
				for(int j=0;j<=3;j++) {
					System.out.print(nums1[i][j]+" ");
				}
				System.out.println();
				}
			
			System.out.println();
			
			//same thing in another way
			for(int[] n:nums1) {
				for(int m:n) {
					System.out.print(m+" ");
				}
				System.out.println();
			}
			
			System.out.println();
//		------------------------------------------------------	
			
			//jagged array
			
			System.out.println("Jagged array");
			int nums2[][]=new int[3][];
			 nums2[0]=new int[3];
			 nums2[1]=new int[4];
			 nums2[2]=new int[2];
			 
			for(int i=0;i<nums2.length;i++) {
				for(int j=0;j<nums2[i].length;j++) {
					nums2[i][j]=(int)(Math.random()*10);
				}
			}
			 
			 for(int[] n:nums2) {
				 for(int m:n) {
					System.out.print(m+" ");
				 }
				 System.out.println();
			 }
			 
			 System.out.println();

			
//			----------------------------------------------------- 
			 System.out.println("3D array");
			 int nums3[][][]=new int[3][4][5];
			 
			 for(int i=0;i<=2;i++) {
				 for(int j=0;j<=3;j++) {
					 for(int k=0;k<=4;k++) {
						 nums3[i][j][k]=(int)(Math.random()*10);
					 }
				 }
			 }
			 for(int i=0;i<=2;i++) {
				 for(int j=0;j<=3;j++) {
					 for(int k=0;k<=4;k++) {
						 System.out.print(nums3[i][j][k]+" ");
					 }
					 System.out.println();
				 }
				 System.out.println();
			 }
			 
			 
		}
	
	
	 
	}


