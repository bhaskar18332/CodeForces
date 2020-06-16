import java.io.*;
import java.util.*;
 
public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static int search(int[] nums, int l, int h, int a)
	{
		if(l<h)
		{
			int mid = (l+h)/2;
			if(mid+1<nums.length && nums[mid]<=a && nums[mid+1]>a)
				return mid;
			if(nums[mid]<=a)
				return search(nums,mid+1,h,a);
			else
				return search(nums,l,mid,a);
		}
		return l;
	}
	public static void solve() throws Exception
	{
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
		}
		Arrays.sort(nums);
		int q= scan.nextInt();
		while(q-->0)
		{
			int a = scan.nextInt();
			if(nums[0]>a)
				System.out.println(0);
			else if(nums[n-1]<=a)
				System.out.println(n);
			else
			{
				int ind = search(nums,0,n-1,a);
				System.out.println(ind+1);
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