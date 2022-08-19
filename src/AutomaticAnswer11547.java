import java.util.Scanner;
import java.lang.Math;
public class AutomaticAnswer11547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int testcase=obj.nextInt();
		
		int z=0;
		
		    for (int i=0;i<testcase;i++)
		    {
		    	int t=obj.nextInt();
		    	z=(((((t*567)/9)+7492)*235)/47)-498;
		    	int temp=Math.abs(z);
		    	temp/=10;
		    	int k=temp%10;
		    	System.out.println(k);
		    	
		    }
			
			
			
			
		

	}

}
