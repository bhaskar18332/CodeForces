import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		String t = scan.next();
		String s = scan.next();
		String a = "qwertyuiopasdfghjkl;zxcvbnm,./";
		StringBuilder ans = new StringBuilder();

		if(t.charAt(0)=='R')
		{
			for(int i=0;i<s.length();i++)
			{
				int ind = a.indexOf(s.charAt(i));
				ans.append(a.charAt(ind-1));
			}
			System.out.println(ans.toString());
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				int ind = a.indexOf(s.charAt(i));
				ans.append(a.charAt(ind+1));
			}
			System.out.println(ans.toString());
		}
		
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