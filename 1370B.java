import java.io.*;
import java.util.*;
 
public class Main
{
	static class Node
	{
		int i; int d;
		Node(int i, int d)
		{
			this.i = i;
			this.d = d;
		}
	}
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int l = 2*n;
		Node[] nums = new Node[l];
		int e=0;
		int o=0;
		int j=0;
		int k=0;
		for(int i=0;i<l;i++)
		{
			int a=scan.nextInt();
			if(a%2!=0)
				nums[k++]=new Node(i+1,a);
			else
			{
				nums[l-j-1]=new Node(i+1,a);
				j++;
			}
			if(a%2==0)
				e++;
			else
				o++;
		}
		if(o%2==0)
		{
			for(int i=0;i<l-2;i=i+2)
			{
				System.out.println(nums[i].i+" "+nums[i+1].i);
			}
		}
		else
		{
			int c=0;
			for(int i=0;i<l;i++)
			{
				if(c==n-1)
					break;
				if(nums[i].d%2!=0 && nums[i+1].d%2==0)
					continue;
				else
				{
					System.out.println(nums[i].i+" "+nums[i+1].i);
					i++;
					c++;
				}
			}
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