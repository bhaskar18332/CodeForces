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
			HashSet<Character> h = new HashSet<>();
			for(int i=0;i<s.length();i++)
			{
				h.add(s.charAt(i));
			}
			if(h.size()%2!=0)
			{
				System.out.println("IGNORE HIM!");
			}
			else
				System.out.println("CHAT WITH HER!");
		}
	}
}
