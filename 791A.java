import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			long ans =0;
			while(a<=b)
			{
				a*=3;
				b*=2;
				ans+=1;
			}
			System.out.println(ans);
		}
	}
}