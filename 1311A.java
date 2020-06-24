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
		if(a==b)
			System.out.println(0);
		else if(a<b)
		{
			long x = b-a;
			if(x%2!=0)
				System.out.println(1);
			else
				System.out.println(2);
		}
		else
		{
			long x = a-b;
			if(x%2!=0)
			{
				System.out.println(2);
			}
			else
				System.out.println(1);
		}
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