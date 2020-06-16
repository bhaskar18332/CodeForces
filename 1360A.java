import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int a = scan.nextInt();
		int b = scan.nextInt();
		long x =(long) Math.min(a,b);
		Long y = (long)Math.max(a,b);
		if(x*2>y)
			System.out.println(x*x*4);
		else
			System.out.println(y*y);
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