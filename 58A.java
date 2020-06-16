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
			int h=0;
			int e=0;
			int l=0;
			int o=0;
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(c=='h')
				{
					h++;
				}
				else if(c=='e')
				{
					if(h!=0)
					{
						e++;
					}
				}
				else if(c=='l')
				{
					if(h!=0 && e!=0)
						l++;
				}
				else if(c=='o')
				{
					if(h!=0 && e!=0 && l>1)
						o++;
				}
			}
			if(h!=0 && e!=0 && l>1 && o!=0)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}
