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
			double a=0;
			for(int i=0;i<n;i++)
			{
				a+=(double)nums[i]/100;
			}
			System.out.println(a/n*100);
		}
	}
}