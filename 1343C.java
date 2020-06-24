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
		int[] nums = new int[n];
		long ans =0;
		long max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			long a = scan.nextLong();
			nums[i]=(int)a;
			if(i==0)
			{
				max = a;
			}
			else
			{
				if((nums[i]<0 && nums[i-1]<0) || (nums[i]>=0 && nums[i-1]>=0))
				{
					max=(long)Math.max(max,a);
				}
				else
				{
					ans+=max;
					max=a;
				}
			}
		}
		ans+=max;
		System.out.println(ans);
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