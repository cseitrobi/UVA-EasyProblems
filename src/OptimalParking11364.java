import java.util.Scanner;
import java.util.Arrays;
public class OptimalParking11364 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		int testcase=obj.nextInt();
		int leftvalue;
		int minimaldistance;
		int middlenumber;
		int rightvalue;
	    //System.out.println("Testcase Number "+testcase);
		for (int i=0;i<testcase;i++)
		{
			int q=obj.nextInt();
			int[] array=new int[q];
			//System.out.println("Total Visiting STORES "+q);
			for (int j=0;j<q;j++)
			{				
				array[j]=obj.nextInt();
				
				//System.out.println("Visiting Store Number "+array[j]);
			}
			//System.out.println(array.length); 
			Arrays.sort(array); 
	        //System.out.println("\nThe sorted array is: "); 
	        for (int num : array) { 
	            //System.out.print(num + " "); 
	        } 
			
			if (q%2==0)
			{
				middlenumber=(array[q/2-1]+array[q/2])/2;
				//System.out.println("Middle Number"+middlenumber);
				leftvalue=middlenumber-array[0];
				//System.out.println("Left value"+leftvalue);
				rightvalue=array[q-1]-middlenumber;
				//System.out.println("Left value"+rightvalue);
				minimaldistance=(leftvalue*2)+(rightvalue*2);
				System.out.println(""+minimaldistance);
				
			}
		}
	}
}
