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
			int m = scan.nextInt();
			long ans = (long)Math.min(n,m);
			if(ans%2==0)
				System.out.println("Malvika");
			else
				System.out.println("Akshat");
		}
	}
}