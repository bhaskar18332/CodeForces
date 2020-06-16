import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int[] nums = new int[3];
			for(int i=0;i<3;i++)
			{
				nums[i]=scan.nextInt();
			}
			Arrays.sort(nums);
			long ans = nums[1]-nums[0]+nums[2]-nums[1];
			System.out.println(ans);
		}
	}
}