import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			long l = 0;
			l=a/c;
			if(a%c!=0)
				l+=1;
			long x = 0;
			x=b/c;
			if(b%c!=0)
				x+=1;
			System.out.println(l*x);
		}
	}
}