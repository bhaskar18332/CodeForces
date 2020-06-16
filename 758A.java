import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n =scan.nextInt();
			int[] nums = new int[n];
			int max = -1;
			long sum = 0;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				if(max<nums[i])
				{
					max = nums[i];
				}
				sum+=nums[i];
			}
			long ans = 0;
			for(int i=0;i<n;i++)
			{
				ans+=max-nums[i];
			}
			System.out.println(ans);
		}
	}
}