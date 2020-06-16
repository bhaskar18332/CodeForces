import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int n = scan.nextInt();
			long ans =0;
			ans+=n/5;
			n%=5;
			ans+=n/4;
			n%=4;
			ans+=n/3;
			n%=3;
			ans+=n/2;
			n%=2;
			ans+=n/1;
			n%=1;
			System.out.println(ans);
		}
	}
}