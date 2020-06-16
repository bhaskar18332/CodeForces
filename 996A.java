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
			long ans =0;
			ans+=n/100;
			n%=100;
			ans+=n/20;
			n%=20;
			ans+=n/10;
			n%=10;
			ans+=n/5;
			n%=5;
			ans+=n/1;
			n%=1;
			System.out.println(ans);
		}
	}
}