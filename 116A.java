import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			int[][] nums = new int[n][2];
			for(int i=0;i<n;i++)
			{
				nums[i][0]=scan.nextInt();
				nums[i][1]=scan.nextInt();
			}
			long ans =-1;
			long a=0;
			for(int i=0;i<n;i++)
			{
				a-=nums[i][0];
				a+=nums[i][1];
				ans=(long)Math.max(ans,a);
			}
			System.out.println(ans);
		}
	}
}