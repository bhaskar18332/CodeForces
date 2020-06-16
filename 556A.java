import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int n = scan.nextInt();
		String s = scan.next();
		int z=0;
		int o=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='0')
				z++;
			else
				o++;
		}
		System.out.println((int)Math.abs(z-o));
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