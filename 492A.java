import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve()
	{
		int n = scan.nextInt();
		int i=1;
		long sum=0;
		while(true)
		{
			int a = (i*(i+1)/2);
			if(sum+a<=n)
			{
				sum+=a;
				i++;
			}
			else
				break;
		}
		System.out.println(i-1);
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