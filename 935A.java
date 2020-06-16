import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve()
	{
		int n = scan.nextInt();
		long c=0;
		for(int i=1;i<=n/2;i++)
		{
			double k = (double)(n-i)/i;
			if(k==(int)k)
				c++;
		}
		System.out.println(c);
	}
	public static void main(String[] args)
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