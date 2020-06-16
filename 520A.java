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
			String s = scan.next();
			s=s.toLowerCase();
			int[] a = new int[26];
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				int v = (int)c;
				a[v-97]++;
			}
			boolean flag = true;
			for(int i=0;i<26;i++)
			{
				if(a[i]==0)
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