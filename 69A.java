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
			int[][] nums = new int[n+1][3];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<3;j++)
				{
					nums[i][j]=scan.nextInt();
				}
			}
			long c=0;
			for(int j=0;j<3;j++)
			{
				nums[n][j]=0;
				for(int i=0;i<n;i++)
				{
					nums[n][j]+=nums[i][j];
				}
				if(nums[n][j]==0)
					c++;
			}
			if(c==3)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}