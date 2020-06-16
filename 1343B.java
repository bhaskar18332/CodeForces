import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int t =scan.nextInt();
			while(t-->0)
			{
				int n = scan.nextInt();
				if(n%4!=0)
					System.out.println("NO");
				else
				{
					System.out.println("YES");
					int a=2;
					int sum1 = 0;
					for(int i=0;i<n/2;i++)
					{
						System.out.print(a+" ");
						sum1+=a;
						a+=2;
					}
					a=1;
					int sum2 = 0;
					for(int i=0;i<n/2-1;i++)
					{
						System.out.print(a+" ");
						sum2+=a;
						a+=2;
					}
					System.out.println(sum1-sum2);
				}
			}
		}
	}
}