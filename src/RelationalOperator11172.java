import  java.util.Scanner;
public class RelationalOperator11172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		int n=obj.nextInt();
		for (int i=0;i<n;i++)
		{
			int a=obj.nextInt();
			int b=obj.nextInt();
			if (a==b)
				System.out.println("=");
			if (a<b)
				System.out.println("<");
			if (a>b)
				System.out.println(">");
			
			
		}
		
		
	

	}

}
