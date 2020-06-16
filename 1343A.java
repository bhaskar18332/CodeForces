import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				int n = scan.nextInt();
				int x=-1;
				for(int i=2;i<=35;i++)
				{
					int a = (int)Math.pow(2,i)-1;
					if(n%a==0)
					{
						x=n/a;
						break;
					}
				}
				System.out.println(x);
			}
		}
	}
}