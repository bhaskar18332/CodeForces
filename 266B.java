import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int n = scan.nextInt();
			int k = scan.nextInt();
			String s = scan.next();
			char[] x = s.toCharArray(); 
			int a=0;
			while(k-->0)
			{
				for(int i=0;i<n-1;i++)
				{
					if(x[i]=='B' && x[i+1]=='G')
					{
						char c = x[i];
						x[i]=x[i+1];
						x[i+1]=c;
						i++;
					}
				}
			}
			StringBuilder st = new StringBuilder();
			for(int i=0;i<n;i++)
			{
				st.append(x[i]);
			}
			System.out.println(st.toString());
		}
	}
}