import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String a = scan.next();
			String b = scan.next();
			a=a.toLowerCase();
			b=b.toLowerCase();
			int x = a.compareTo(b);
			if(x==0)
				System.out.println(0);
			else if(x<0)
				System.out.println(-1);
			else
				System.out.println(1);
		}
	}
}