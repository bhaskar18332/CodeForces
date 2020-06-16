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
			while(n>0)
			{
				if(n%2!=0)
				{
					a.add(3);
					n-=3;
				}
				else
				{
					a.add(2);
					n-=2;
				}
			}
			int s = a.size();
			System.out.println(s);
			for(int i=0;i<s;i++)
			{
				System.out.print(a.get(i)+" ");
			}
		}
	}
}