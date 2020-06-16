import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				int n = scan.nextInt();
				long sum1 = (long)Math.pow(2,n);
				long sum2 = 0;
				long a =1;
				for(int i=1;i<n/2;i++)
				{
					sum1+=(a*2);
					a*=2;
				}
				for(int i=n/2;i<n;i++)
				{
					sum2+=(a*2);
					a*=2;
				}
				System.out.println(sum1-sum2);
			}
		}
	}
}