import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long n = scan.nextLong();
			if(n%2==0)
				System.out.println(4+" "+(n-4));
			else
				System.out.println(9+" "+(n-9));
		}
	}
}