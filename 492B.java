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
			int l = scan.nextInt();
			int[] nums = new int[n];
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
			}
			Arrays.sort(nums);
			long ans = -1;
			for(int i=0;i<n-1;i++)
			{
				ans=(long)Math.max(Math.abs(nums[i]-nums[i+1]),ans);
			}
			double c = (double)ans/2;
			double a = 0;
			double b = 0;
			if(nums[0]!=0)
			{
				a=nums[0];
			}
			if(nums[n-1]!=l)
			{
				b=l-nums[n-1];
			}
			System.out.println(Math.max(Math.max(a,b),c));
		}
	}
}