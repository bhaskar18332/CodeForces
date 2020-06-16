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
			String s="I hate ";
			for(int i=1;i<n;i++)
			{
				s+="that ";
				if(i%2!=0)
				{
					s+="I love ";
				}
				else
					s+="I hate ";
			}
			s+="it";
			System.out.println(s);
		}
	}
}