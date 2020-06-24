import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		String s = scan.next();
		String x = scan.next();
		long ans=0;
		for(int i=0;i<n;i++)
		{
			int a = Integer.parseInt(""+s.charAt(i));
			int b = Integer.parseInt(""+x.charAt(i));
			long min = (long)Math.min(a,b);
			long max = (long)Math.max(a,b);
			long t = (long)Math.min(Math.abs(a-b),10-max+min);
			ans+=t;
		}
		System.out.println(ans);
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