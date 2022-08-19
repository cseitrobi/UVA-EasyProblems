import java.util.Scanner;
public class LanguageDetection12250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String line;
		for (int i=0;i<1999;i++)
		{
			line=obj.nextLine();
			if(line.charAt(i) == '#')   
                break; 
			else if (line.contains("\'HELLO\'"))
				System.out.println("Case 1: ENGLISH");
			else if (line.contains("\'HOLA\'"))
				System.out.println("Case 2: SPANISH");
			else if (line.contains("\'HALLO\'"))
				System.out.println("Case 3: GERMAN");
			else if (line.contains("\'BONJOUR\'"))
				System.out.println("Case 4: FRENCH");
			else if (line.contains("\'CIAO\'"))
				System.out.println("Case 5: ITALIAN");
			else if (line.contains("\'ZDRAVSTVUJTE\'"))
				System.out.println("Case 6: RUSSIAN");			
			else
			{
				System.out.println("UNKNOWN");
			}
		}

	}

}
