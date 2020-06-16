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
			long k = scan.nextLong();
			int a=2;
			int b=1;
			long x=-1;
			if(n%2!=0)
			{
				x = (n+1)/2;
			}
			else
			{
				x=n/2;
			}
			if(k<=x)
				System.out.println(b+2*(k-1));
 
			else
			{
				k-=x;
				System.out.println(a+2*(k-1));
			}
		}
	}
}