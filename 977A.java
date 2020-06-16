import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			int k = scan.nextInt();
			while(k-->0)
			{
				int dig = n%10;
				if(dig==0)
				{
					n/=10;
				}
				else
					n-=1;
			}
			System.out.println(n);
		}
	}
}