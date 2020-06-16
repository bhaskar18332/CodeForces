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
				int n = scan.nextInt();
				if(360%(180-n)==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}