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
			int m=0;
			int c=0;
			for(int i=0;i<n;++i)
			{
				int a= scan.nextInt();
				int b = scan.nextInt();
				if(a==b)
					continue;
				else if(a<b)
				{
					c++;
				}
				else
					m++;
			}
			if(m==c)
				System.out.println("Friendship is magic!^^");
			else if(m>c)
				System.out.println("Mishka");
			else
				System.out.println("Chris");
		}
	}
}