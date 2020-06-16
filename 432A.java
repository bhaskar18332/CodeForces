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
			int k = scan.nextInt();
			long c=0;
			for(int i=0;i<n;++i)
			{
				int a = scan.nextInt();
				if(5-a>=k)
					c++;
			}
			System.out.println(c/3);
		}
	}
}