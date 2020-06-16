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
			char[] x = b.toCharArray();
			int l = x.length;
			for(int i=0;i<l/2;i++)
			{
				char c = x[i];
				x[i]=x[l-i-1];
				x[l-1-i]=c;
			}
			StringBuilder st = new StringBuilder();
			for(int i=0;i<l;i++)
			{
				st.append(x[i]);
			}
			b = st.toString();
			if(a.equals(b))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}