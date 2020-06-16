import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n =scan.nextInt();
			String s = scan.next();
			long ans =0;
			Stack<Character> st = new Stack<>();
			for(int i=0;i<n;i++)
			{
				char c = s.charAt(i);
				if(st.isEmpty())
				{
					st.push(c);
				}
				else
				{
					if(st.peek()==c)
					{
						ans++;
						continue;
					}
					st.push(c);
				}
			}
			System.out.println(ans);
		}
	}
}