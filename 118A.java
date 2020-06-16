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
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='y' || c=='Y')
				{
					continue;
				}
				if(Character.isUpperCase(c))
					c=Character.toLowerCase(c);
				System.out.print("."+c);
			}
		}
	}
}