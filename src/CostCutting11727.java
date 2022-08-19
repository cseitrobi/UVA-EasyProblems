import java.util.Scanner;
import java.util.Arrays;
public class CostCutting11727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int testcase=obj.nextInt();
		int[] array=new int[3];
		for (int i=1;i<=testcase;i++)
		{
			if (testcase>20)
				break;
			for (int j=0;j<3;j++)
			{
				array[j]=obj.nextInt();				
			}
			Arrays.sort(array);
			System.out.println("Case "+i+":  "+array[1]);
			
		}

	}

}
