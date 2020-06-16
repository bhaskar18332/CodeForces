import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int k = scan.nextInt();
			int l = scan.nextInt();
			int m = scan.nextInt();
			int n = scan.nextInt();
			int d = scan.nextInt();
			long c=0;
			long ans = d;
			if(k==1 || l==1 || m==1 || n==1)
				System.out.println(d);
			else
			{
				for(int i=1;i<=d;i++)
				{
					if(i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0)
					{
						ans--;
						c++;
					}
				}
				System.out.println(d-c);
			}
		}
	}
}