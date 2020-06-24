import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		String s = scan.next();
		int l = s.length();
		int[] ans = new int[l];
		for(int i=1;i<l;i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
				ans[i]=ans[i-1]+1;
			else
				ans[i]=ans[i-1];
		}
		int q = scan.nextInt();
		while(q-->0)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(ans[b-1]-ans[a-1]);
		}
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