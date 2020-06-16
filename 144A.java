import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] nums = new int[n];
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int min_idx=-1;
			int max_idx = -1;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				if(nums[i]<=min)
				{
					min = nums[i];
					min_idx = i;
				}
				if(nums[i]>max)
				{
					max = nums[i];
					max_idx = i;
				}
			}
			if(max_idx<min_idx)
			{
				long ans = max_idx+n-min_idx-1;
				System.out.println(ans);
			}
			else
			{
				long ans = n-min_idx-1+max_idx-1;
				System.out.println(ans);
			}
			//System.out.println(max+"idx: "+max_idx+" "+min+"idx: "+min_idx);
		}
	}
}