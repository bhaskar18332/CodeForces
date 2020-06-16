import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] nums = new int[n];
			long sum =0;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				sum+=nums[i];
			}
			Arrays.sort(nums);
			long a=0;
			int c=0;
			int i;
			for(i=n-1;i>=0;i--)
			{
				if(c+nums[i]<=sum-nums[i])
				{
					c+=nums[i];
					sum-=nums[i];
				}
				else
					break;
			}
			if(i>=0)
				System.out.println(n-i);
			else
				System.out.println(n);
		}
	}
}