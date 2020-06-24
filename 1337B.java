import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int x = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		while(x>0 && (n>0 || m>0))
		{
			if(x/2+10<x && n>0)
			{
				x=x/2+10;
				n-=1;
			}
			else if(m>0)
			{
				m-=1;
				x-=10;
			}
			else
				break;
		}
		if(x<=0)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			//int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}