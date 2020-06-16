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
			ArrayList<Integer> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();
			ArrayList<Integer> c= new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				int x = scan.nextInt();
				if(x==1)
					a.add(i+1);
				else if(x==2)
					b.add(i+1);
				else
					c.add(i+1);
			}
			int min = (int)Math.min(Math.min(a.size(),b.size()),c.size());
			System.out.println(min);
			for(int i=0;i<min;i++)
			{
				System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
			}
		}
	}
}