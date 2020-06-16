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
			Arrays.sort(nums);
			for(int i=0;i<n;i++)
			{
				System.out.print(nums[i]+" ");
			}
			System.out.println();
		}
	}
}