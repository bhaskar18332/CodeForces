import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int n = scan.nextInt();
		long a = 0,b=0,c=0;
		for(int i=0;i<n;i++)
		{
			a+=scan.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			b+=scan.nextInt();
		}
		for(int i=0;i<n-2;i++)
		{
			c+=scan.nextInt();
		}
		System.out.println(a-b);
		System.out.println(b-c);
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