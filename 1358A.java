import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int a = scan.nextInt();
		int b = scan.nextInt();
		long x = a*b;
		if(x%2!=0)
			System.out.println((x+1)/2);
		else
			System.out.println(x/2);
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