import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			long ans=a;
			while(a>0)
			{
				ans+=a/b;
				a=a/b+a%b;
				if(a<b)
					break;
			}
			System.out.println(ans);
		}
	}
}