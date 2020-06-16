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
			for(int i=n+1;i<=9012;i++)
			{
				int a= i%10;
				int b = (i/10)%10;
				int c = (i/100)%10;
				int d= (i/1000)%10;
				if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}