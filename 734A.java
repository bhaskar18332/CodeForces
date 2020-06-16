import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			String s = scan.next();
			int a=0;
			int b=0;
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(c=='A')
					a++;
				else
					b++;
			}
			if(a<b)
				System.out.println("Danik");
			else if(a>b)
				System.out.println("Anton");
			else
				System.out.println("Friendship");
		}
	}
}
