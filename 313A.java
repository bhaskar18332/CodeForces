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
			int l = s.length();
			if(s.charAt(0)=='-')
			{
				int a = Integer.parseInt(""+s.charAt(l-1));
				int b = Integer.parseInt(""+s.charAt(l-2));
				if(a>b)
				{
					System.out.println(Integer.parseInt(s.substring(0,l-1)));
				}
				else
					System.out.println(Integer.parseInt(s.substring(0,l-2)+s.charAt(l-1)));
			}
			else
				System.out.println(s);
		}
	}
}