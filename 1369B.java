import java.io.*;
import java.util.*;

public class B
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		String s = scan.next();
		boolean flag = false;
		if(n==1)
			System.out.println(s);
		else
		{
			int i=s.indexOf('1');
			int j=s.lastIndexOf('0');
			if(i==-1 || j==-1)
				System.out.println(s);
			else if(j<i)
				System.out.println(s);
			else
				System.out.println(s.substring(0,i)+s.substring(j,n));
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