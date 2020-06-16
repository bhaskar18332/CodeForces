import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			while(t-->0)
			{
				int n= scan.nextInt();
				int m = scan.nextInt();
				System.out.println(Math.min(2,n-1)*m);
			}
		}
	}
}