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
			StringBuilder a = new StringBuilder();
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(i==0)
				{
					if(Character.isUpperCase(c))
						a.append(Character.toLowerCase(c));	
					else
						a.append(Character.toUpperCase(c));
				}
				else if(Character.isLowerCase(c))
					break;
				else
					a.append(Character.toLowerCase(c));
			}
			String x = a.toString();
			if(x.length()!=s.length())
				System.out.println(s);
			else
				System.out.println(x);
		}
	}
}