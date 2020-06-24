import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int[] nums = new int[n];
		int e=0;
		int o=0;
		long sum =0;
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
			sum+=nums[i];
			if(nums[i]%2==0)
				e++;
			else
				o++;
		}
		if(sum%2!=0)
			System.out.println("YES");
		else
		{
			if(e==0 || o==0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			//int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}