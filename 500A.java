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
			int t = scan.nextInt();
			int[] nums = new int[n-1];
			for(int i=0;i<n-1;i++)
			{
				nums[i]=scan.nextInt();
			}
			boolean flag = false;
			int i=0;
			while(i<n-1)
			{
				if(i==t-1)
				{
					flag = true;
					break;
				}
				i+=nums[i];
			}
			if(flag || i==t-1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}