import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String s = scan.next();
			char x = s.charAt(0);
			char y = s.charAt(1);
			boolean flag = false;
			for(int i=0;i<5;i++)
			{
				String w = scan.next();
				char a = w.charAt(0);
				char b = w.charAt(1);
				if(a==x || a==y || b==x || b==y)
				{
					flag = true;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}