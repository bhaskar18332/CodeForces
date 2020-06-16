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
			int e=0;
			int o=0;
			int p=-1;
			int q=-1;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				if(nums[i]%2!=0)
				{
					o++;
					p=i;
				}
				else
				{
					e++;
					q=i;
				}
			}
			if(e==1)
				System.out.println(q+1);
			else
				System.out.println(p+1);
		}
	}
}