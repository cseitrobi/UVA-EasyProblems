import java.io.*;

public class Celebrityjeopardy1124 {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		while(br.ready())
		{
			String s = br.readLine();
			out.append(s+"\n");
		}
		out.flush();
	}
}