import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int n = scan.nextInt();
		int x = scan.nextInt();
		long a=x;
		int i=0;
		while(a>0)
		{
			a/=10;
			i++;
		}
		n=n-i+1;
		String s = "";
		for(i=0;i<n;i++)
		{
			if(i==0)
				s=s+x;
			else
				s=s+'0';
		}
		if(s=="")
			System.out.println(-1);
		else
			System.out.println(s);
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