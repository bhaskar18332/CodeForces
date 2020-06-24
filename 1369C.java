import java.io.*;
import java.util.*;

public class C
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer[] nums = new Integer[n];
		int[] w = new int[k];
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			w[i]=scan.nextInt();
		}
		Arrays.sort(nums,Collections.reverseOrder());
		Arrays.sort(w);
		long ans=0;
		int a=k;
		int l=0;
		int r=n-1;
		for(int i=0;i<k;i++)
		{
			if(w[i]>1)
			{
				a=i;
				break;
			}
			ans+=2*nums[l++];
		}
		for(int i=k-1;i>(a-1);i--)
		{
			int j=w[i];
			ans+=nums[l]+nums[r];
			r=r-j+1;
			l++;
		}
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