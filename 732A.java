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
			int r = scan.nextInt();
			int c=1;
			int a = n;
			while(true)
			{
				if(n%10==r || n%10==0)
				{
					break;
				}
				n+=a;
				c++;
			}
			System.out.println(c);
		}
	}
}