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
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
			}
			long ans = -1;
			long c=0;
			for(int i=0;i<n;i++)
			{
				if(i==0)
					c=1;
				else
				{
					if(nums[i-1]<=nums[i])
						c++;
					else
					{
						ans = Math.max(ans,c);
						c=1;
					}
				}
			}
			ans=Math.max(ans,c);
			System.out.println(ans);
		}
	}
}
