import java.io.*;
import java.util.Scanner;
 class TexQuote272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);  
        String line;  
        boolean open = false;  
        while(obj.hasNextLine()) {  
             line = obj.nextLine();  
             for(int i = 0; i < line.length(); i++) {  
                  /*if(line.charAt(i) == '\u001a')  // EOF Character  
                       break;  */
                  
                  if(line.charAt(i) == '\"') {  
                       if(open == false) {  
                            System.out.print("``");  
                            open = true;  
                            continue;  
                       } else {  
                            System.out.print("''");  
                            open = false;  
                            continue;  
                       }  
                  }  
                  System.out.print(line.charAt(i));  
             }  
             System.out.print("\n");    

		

		

	}
	}
}


