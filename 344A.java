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
			String[] a = new String[n];
			long c=1;
			for(int i=0;i<n;i++)
			{
				String s = scan.next();
				a[i]=s;
			}
			for(int i=1;i<n;i++)
			{
				if(!a[i].equals(a[i-1]))
					c++;
			}
			System.out.println(c);
		}
	}
}
