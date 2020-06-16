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
			int t = 240-scan.nextInt();
			int i=0;
			int sum =0;
			boolean flag = true;
			for(i=1;i<=n;i++)
			{
				if(sum+5*i>t)
				{
					flag = false;
					System.out.println(i-1);
					break;
				}
				else
					sum+=5*i;
			}
			if(flag)
				System.out.println(n);
		}
	}
}