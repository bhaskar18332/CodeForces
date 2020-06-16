import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			long ans = -1;
			for(int i=0;i*a<=n;i++)
			{
				for(int j=0;i*a+j*b<=n;j++)
				{
					int k = (n-i*a-j*b)/c;
					if(i*a+j*b+k*c==n)
						ans=(long)Math.max(i+j+k,ans);
				}
			}
			System.out.println(ans);
		}
	}
}