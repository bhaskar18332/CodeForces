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
			long c=0;
			int x = scan.nextInt();
			int max = x;
			int min = x;
			for(int i=1;i<n;i++)
			{
				int a = scan.nextInt();
				if(min>a)
				{
					min = a;
					c++;
				}
				if(max<a)
				{
					max = a;
					c++;
				}
			}
			System.out.println(c);
		}
	}
}