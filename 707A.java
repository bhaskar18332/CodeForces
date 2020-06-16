import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		StringTokenizer tk = new StringTokenizer(scan.nextLine());
		int n = Integer.parseInt(tk.nextToken());//scan.nextInt();
		int a = Integer.parseInt(tk.nextToken());//scan.nextInt();
		boolean flag = true;
		int c=0;
		int m = 0;
		int y=0;
		int w=0;
		int g=0;
		int b=0;
		for(int j=0;j<n;j++)
		{
			String s = scan.nextLine();
			for(int i=0;i<s.length();i=i+2)
			{
				char x = s.charAt(i);
				if(x=='C')
					c++;
				else if(x=='M')
					m++;
				else if(x=='Y')
					y++;
				else if(x=='W')
					w++;
				else if(x=='G')
					g++;
				else if(x=='B')
					b++;
			}
		}
		if(c==0 && m==0 && y==0)
		{
			System.out.println("#Black&White");
		}
		else
			System.out.println("#Color");
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			//int t= scan.nextInt();
			int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}