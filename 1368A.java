import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		if(a>b)
		{
			int temp =a;
			a=b;
			b=temp;
		}
		long c=0;
		while(a<=n && b<=n)
		{
			if(a<b)
			{
				a+=b;
			}
			else
			{
				b+=a;
			}
			c++;
		}
		System.out.println(c);
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