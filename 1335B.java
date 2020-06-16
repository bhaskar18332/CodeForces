import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			while(t-->0)
			{
				int n = scan.nextInt();
				int a = scan.nextInt();
				int b = scan.nextInt();
				int z = (int)Math.min(a,b);
				String s = "";
				for(int i=0;i<b;i++)
				{
					s+=(char)('a'+i);
				}
				String x = s;
				for(int i=0;i<(n/z)-1;i++)
				{
					s+=x;
				}
				if(n%z!=0)
				{
					s+=x;
				}
				System.out.println(s.substring(0,n));
			}
		}
	}
}