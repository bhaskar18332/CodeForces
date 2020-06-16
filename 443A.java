import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String s = scan.nextLine();
			int[] a = new int[26];
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				int v = (int)c;
				if(v>=97 && v<=122)
				{
					a[v-97]++;
				}
			}
			long c=0;
			for(int i=0;i<26;i++)
			{
				if(a[i]!=0)
					c++;
			}
			System.out.println(c);
		}
	}
}
