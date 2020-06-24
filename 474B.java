import java.io.*;
import java.util.*;

public class Main
{
	public static int search(int[] sums, int l, int h, int x)
	{
		if(l<h)
		{
			int mid = l+(h-l)/2;
			if(sums[mid]==x)
				return mid;
			if(sums[mid]>x)
				return search(sums,l,mid,x);
			else
				return search(sums,mid+1,h,x);
		}
		return l;
	}
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int[] nums = new int[n];
		int[] sums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
			if(i==0)
				sums[i]=nums[i];
			else
				sums[i]=sums[i-1]+nums[i];
		}

		int m = scan.nextInt();
		for(int i=0;i<m;i++)
		{
			int x = scan.nextInt();
			System.out.println(search(sums,0,n-1,x)+1);
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