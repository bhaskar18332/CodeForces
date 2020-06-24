import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int[] nums = new int[4];
		for(int i=0;i<4;i++)
		{
			nums[i]=scan.nextInt();
		}
		String s = scan.next();
		long ans =0;
		for(int i=0;i<s.length();i++)
		{
			int v = Integer.parseInt(""+s.charAt(i));
			ans+=nums[v-1];
		}
		System.out.println(ans);
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