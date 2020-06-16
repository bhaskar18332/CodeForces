import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				String s = scan.next();
				int l = s.length();
				if(l>10)
				{
					char a = s.charAt(0);
					char b = s.charAt(l-1);
					System.out.println(""+a+(l-2)+b);
				}
				else
					System.out.println(s);
			}
		}
	}
}