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
			int c=0;
			for(int i=0;i<n;i++)
			{
				int p = scan.nextInt();
				int q = scan.nextInt();
				if(p+2<=q)
					c++;
			}
			System.out.println(c);
		}
	}
}