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
			long ans =0;
			int c=0;
			for(int i=0;i<n;i++)
			{
				int a = scan.nextInt();
				if(a==-1 && c==0)
				{
					ans++;
				}
				else
					c+=a;
			}
			System.out.println(ans);
		}
	}
}