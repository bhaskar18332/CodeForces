import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String s = scan.next();
			int a=0;
			int b=0;
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				char x = s.charAt(i);
				if(x=='+')
					continue;
				if(x=='1')
					a++;
				else if(x=='2')
					b++;
				else if(x=='3')
					c++;
			}
			StringBuilder ans = new StringBuilder();
			for(int i=0;i<s.length();i++)
			{
				char x = s.charAt(i);
				if(x=='+')
				{
					ans.append(x);
				}
				else
				{
					if(a!=0)
					{
						ans.append(1);
						a-=1;
					}
					else if(b!=0)
					{
						ans.append(2);
						b-=1;
					}
					else if(c!=0)
					{
						ans.append(3);
						c-=1;
					}
					else
						break;
				}
			}
			System.out.println(ans.toString());
		}
	}
}
