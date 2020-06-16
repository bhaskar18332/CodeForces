import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				String s = scan.next();
				ArrayList<Integer> a = new ArrayList<>();
				for(int i=0;i<s.length();i++)
				{
					char c = s.charAt(i);
					if(c!='0')
					{
						int dig = Integer.parseInt(""+c);
						a.add(dig*(int)Math.pow(10,s.length()-i-1));
					}
				}
				System.out.println(a.size());
				for(int i=0;i<a.size();i++)
				{
					System.out.print(a.get(i)+" ");
				}
			}
		}
	}
}