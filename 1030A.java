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
			int a=0;
			for(int i=0;i<n;i++)
			{
				nums[i]=scan.nextInt();
				if(nums[i]==1)
					a++;
			}
			if(a!=0)
				System.out.println("HARD");
			else
				System.out.println("EASY");
		}
	}
}