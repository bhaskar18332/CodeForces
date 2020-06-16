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
			long a =0;
			long b=0;
			boolean flag = true;
			if(s.length()>6)
			{
				for(int i=0;i<s.length();i++)
				{
					char x = s.charAt(i);
					if(x=='0')
					{
						a+=1;
						b=0;
					}
					else
					{
						b+=1;
						a=0;
					}
					if(a>=7 || b>=7)
					{
						System.out.println("YES");
						flag = false;
						break;
					}
				}
				if(flag)
					System.out.println("NO");
			}
			else
				System.out.println("NO");
		}
	}
}