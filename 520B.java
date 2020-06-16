import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n= scan.nextInt();
			int m = scan.nextInt();
			if(n>m)
			{
				System.out.println(n-m);
			}
			else
			{
				long ans =0;
				while(n!=m)
				{
					//System.out.println(n+" "+m);
					if(m<n)
					{
						ans+=n-m;
						m=n;
						break;
					}
					if(m%2!=0)
					{
						ans+=1;
						m+=1;
					}
					else
					{
						ans+=1;
						m/=2;
					}
				}
				System.out.println(ans);
			}
		}
	}
}