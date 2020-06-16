import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n =scan.nextInt();
		int[] l = new int[n];
		int[] r = new int[n];
		for(int i=0;i<n;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			l[i]=a;
			r[i]=b;
		}
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<l[i])
				max = l[i];
			if(min>r[i])
				min = r[i];
		}
		if(max-min<0)
			System.out.println(0);
		else
			System.out.println(max-min);
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