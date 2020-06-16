import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n =scan.nextInt();
			int m = scan.nextInt();
			long c=0;
			while(n>0)
			{
				n-=1;
				c++;
				if(c%m==0)
					n+=1;
			}
			System.out.println(c);
		}
	}
}