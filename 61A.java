import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			String a = scan.next();
			String b = scan.next();
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)==b.charAt(i))
					System.out.print(0);
				else
					System.out.print(1);
			}
		}
	}
}