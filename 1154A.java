import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long[] x = new long[4];
			for(int i=0;i<4;i++)
			{
				x[i]=scan.nextLong();
			}
			Arrays.sort(x);
			long a = x[3]-x[2];
			long b = x[0]+x[2]-x[3];
			long c = x[3]-x[0];
			System.out.println(a+" "+b+" "+c);
		}
	}
}