import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] nums = new int[n];
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
			}
			int v = nums[k-1];
			long c =0;
			for(int i=0;i<n;i++)
			{
				if(nums[i]>=v && nums[i]>0)
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}
}