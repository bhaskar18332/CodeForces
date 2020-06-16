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
			boolean flag = true;
			for(int i=0;i<s.length();i++)
			{
				char x = s.charAt(i);
				if(x=='H' || x=='Q' || x=='9')
				{
					System.out.println("YES");
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("NO");
		}
	}
}