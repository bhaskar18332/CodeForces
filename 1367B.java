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
		int c=0;
		int e=0;
		int o=0;
		for(int i=0;i<n;i++)
		{
			nums[i] = scan.nextInt();
			if(nums[i]%2==i%2)
				continue;
			else
			{
				if(nums[i]%2!=0)
					o++;
				else
					e++;
			}
		}
		if(o==e)
			System.out.println(o);
		else
			System.out.println(-1);
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