import java.io.*;
import java.util.*;
 
public class Main
{
	public static int count(long n)
	{
		int c=0;
		while(n>0)
		{
			int dig = (int)n%10;
			if(dig==4 || dig==7)
				c++;
			n/=10;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String s = scan.next();
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='4' || s.charAt(i)=='7')
				{
					c++;
				}
			}
			if(c==4 || c==7)
				System.out.println("YES");
			else
				System.out.println("NO");
 
		}
	}
}