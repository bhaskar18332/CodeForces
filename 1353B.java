import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				int n = scan.nextInt();
				int k = scan. nextInt();
				int[] a= new int[n];
				int[] b = new int[n];
				long sum = 0;
				for(int i=0;i<n;i++)
				{
					a[i]=scan.nextInt();
					sum+=a[i];
				}
				for(int i=0;i<n;i++)
				{
					b[i]=scan.nextInt();
				}
				if(k==0)
					System.out.println(sum);
				else
				{
					Arrays.sort(a);
					Arrays.sort(b);
					for(int i=0;i<n;i++)
					{
						if(k==0)
						{
							break;
						}
						else
						{
							if(a[i]<b[n-i-1])
							{
								sum-=a[i];
								sum+=b[n-i-1];
								k--;
								int temp = a[i];
								a[i]=b[n-i-1];
								b[n-i-1]=temp;
							}
						}
					}
					System.out.println(sum);
				}
			}
		}
	}
}