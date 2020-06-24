import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int x = scan.nextInt();
		int y = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		long ans =0;
		long min = (long)Math.min(x,y);
		long max = (long)Math.max(x,y);
		ans+=(long)Math.min(min*b,2*min*a);
		ans+=(max-min)*a;
		System.out.println(ans);
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			//int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}