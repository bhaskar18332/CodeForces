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
			int[] x = new int[101];
			int[] y = new int[101];
			for(int i=0;i<n;i++)
			{
				int a = scan.nextInt();
				int b = scan.nextInt();
				x[a]++;
				y[b]++;
			}
			long ans=0;
			for(int i=1;i<=100;i++)
			{
				ans+=(x[i]*y[i]);
			}
			System.out.println(ans);
		}
	}
}