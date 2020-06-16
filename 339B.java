import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve()
	{
		int n = scan.nextInt();
		int m = scan.nextInt();
		long ans =0;
		int curr=1;
		for(int i=0;i<m;i++)
		{
			int a = scan.nextInt();
			if(curr<=a)
			{
				ans+=a-curr;
				curr = a;
			}
			else
			{
				ans+=a+n-curr;
				curr =a;
			}
		}
		System.out.println(ans);
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