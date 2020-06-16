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
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(m*a<=b)
				System.out.println(n*a);
			else
				System.out.println((n/m)*b+(int)Math.min((n%m)*a,b));
		}
	}
}