import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long n = scan.nextLong();
		/*	long x=n/2;
			long e = x*(x+1);
			long t = n*(n+1)/2;
			long ans = 2*e-t;
		*/
			long ans =0;
			if(n%2!=0)
			{
				ans=(n-1)/2-n;
			}
			else
				ans=n/2;
			System.out.println(ans);
		}
	}
}