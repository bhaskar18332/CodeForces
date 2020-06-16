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
			HashSet<Integer> h = new HashSet<>();
			for(int i=0;i<2;i++)
			{
				int k = scan.nextInt();
				for(int j=0;j<k;j++)
				{
					int a = scan.nextInt();
					h.add(a);
				}
			}
			if(h.size()==n)
				System.out.println("I become the guy.");
			else
				System.out.println("Oh, my keyboard!");
		}
	}
}