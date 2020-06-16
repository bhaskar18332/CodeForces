import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		long sum = a+b+c+n;
		if(sum%3!=0)
			System.out.println("NO");
		else
		{
			sum=sum/3;
			if(sum>=a && sum>=b && sum>=c)
				System.out.println("YES");
			else
				System.out.println("NO");
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