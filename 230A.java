import java.io.*;
import java.util.*;
 
public class Main
{
	static class Node
	{
		int a;
		int b;
		Node(int x, int y)
		{
			this.a = x;
			this.b = y;
		}
	}
	static class Sort implements Comparator<Node>
	{
		public int compare(Node a, Node b)
		{
			return a.a-b.a;
		}
	}
 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long s = scan.nextLong();
			int n = scan.nextInt();
			Node[] x = new Node[n];
			for(int i=0;i<n;i++)
			{
				int a = scan.nextInt();
				int b = scan.nextInt();
				x[i]=new Node(a,b);
			}
			Arrays.sort(x,new Sort());
			boolean flag = true;
			for(int i=0;i<n;i++)
			{
				if(x[i].a<s)
				{
					s+=x[i].b;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
 
		}
	}
}