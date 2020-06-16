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
			int m = scan.nextInt();
			int[] nums = new int[m];
			for(int i=0;i<m;i++)
			{
				nums[i]=scan.nextInt();
			}
			Arrays.sort(nums);
			long ans = Integer.MAX_VALUE;
			for(int i=n-1;i<m;i++)
			{
				int a = nums[i]-nums[i-n+1];
				ans=Math.min(ans,a);
			}
			System.out.println(ans);
		}
	}
}