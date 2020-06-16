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
			int[][] a = new int[n][n];
			long ans =1;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==0)
					{
						a[i][j]=1;
					}
					else if(j==0)
					{
						a[i][j]=1;
					}
					else
					{
						a[i][j]=a[i-1][j]+a[i][j-1];
						ans=(long)Math.max(ans,a[i][j]);
					}
				}
			}
			System.out.println(ans);
		}
	}
}