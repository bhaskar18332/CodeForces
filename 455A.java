import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			long n = scan.nextLong();
			long[] count = new long[100005];
			long[] res = new long[100005];
			int max = -1;
			for(int i=0;i<n;i++)
			{
				int a = scan.nextInt();
				count[a]++;
				if(a>max)
					max=a;
			}
			res[1]=count[1];
			for(int i=2;i<=max;i++)
			{
				res[i]=Math.max(res[i-1],res[i-2]+i*count[i]);
			}
			System.out.println(res[max]);
		}
	}
}