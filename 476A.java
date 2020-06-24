import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int m = scan.nextInt();
		if(n<m)
			System.out.println(-1);
		else if(n==m)
			System.out.println(n);
		else
		{
			long ans = n/2;
			if(ans%m==0 && ans==(double)n/2)
				System.out.println(ans);
			else
			{
				ans+=m-(ans%m);
				System.out.println(ans);
			}
		}
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