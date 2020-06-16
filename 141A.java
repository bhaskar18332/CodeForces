import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String a = scan.next();
			String b = scan.next();
			String c= scan.next();
			int[] x = new int[26];
			int[] y = new int[26];
			boolean flag = true;
			for(int i=0;i<a.length();i++)
			{
				char z = a.charAt(i);
				int v = (int)z;
				x[v-65]++;
			}
			for(int i=0;i<b.length();i++)
			{
				char z = b.charAt(i);
				int v = (int)z;
				x[v-65]++;
			}
			for(int i=0;i<c.length();i++)
			{
				char z = c.charAt(i);
				int v = (int)z;
				y[v-65]++;
			}
			for(int i=0;i<26;i++)
			{
				if(x[i]!=y[i])
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}