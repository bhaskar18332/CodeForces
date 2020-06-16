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
				long n = scan.nextLong();
				if(n%2!=0)
				{
					System.out.println(n/2);
				}
				else
					System.out.println((n-1)/2);
			}
		}
	}
}