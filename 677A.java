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
			int h = scan.nextInt();
			int[] nums = new int[n];
			long ans = 0;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				if(nums[i]>h)
					ans+=2;
				else
					ans+=1;
			}
			System.out.println(ans);
		}
	}
}
