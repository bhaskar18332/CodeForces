import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int k = scan.nextInt();
			int n = scan.nextInt();
			int w = scan.nextInt();
			long ans = (k*(w+1)*w)/2;
			if(ans-n<=0)
				System.out.println(0);
			else
				System.out.println(ans-n);
		}
	}
}