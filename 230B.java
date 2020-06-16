import java.io.*;
import java.util.*;
 
public class Main
{
	public static boolean check(int n)
	{
		if(n<=1)
			return false;
		if(n<=3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
 
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long n = scan.nextLong();
			for(int i=0;i<n;i++)
			{
				long a = scan.nextLong();
				if(a<4)
					System.out.println("NO");
				else
				{
					double b = Math.sqrt(a);
					if(b==(int)b && check((int)b))
						System.out.println("YES");
					else
					{
						System.out.println("NO");
					}
				}
			}
		}
	}
}