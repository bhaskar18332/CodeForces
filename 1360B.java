import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		int n = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
		}
		Arrays.sort(nums);
		for(int i=1;i<n;i++)
		{
			int a = (int)Math.abs(nums[i]-nums[i-1]);
			min = (int)Math.min(min,a);
		}
		System.out.println(min);
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