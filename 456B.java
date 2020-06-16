import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		String s = scan.next();
		int l = s.length();
		int a;
		if(l==1)
		{
			a = Integer.parseInt(""+s);
		}
		else
		{
			a = Integer.parseInt(""+s.charAt(l-2)+s.charAt(l-1));
		}
		if(a%4!=0)
			System.out.println(0);
		else
			System.out.println(4);
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			//int t= scan.nextInt();
			int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}