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
			int a=0;
			int b=0;
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(Character.isUpperCase(c))
					b++;
				else
					a++;
			}
			if(a>=b)
				s=s.toLowerCase();
			else
				s=s.toUpperCase();
			System.out.println(s);
		}
	}
}