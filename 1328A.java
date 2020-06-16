import java.io.*;
import java.util.*;
 
public class Main5{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int t = scan.nextInt();
			while(t-->0)
			{
				int a = scan.nextInt();
				int b = scan.nextInt();
				a = a%b;
				if(a==0)
					System.out.println(0);
				else
					System.out.println(b-a);
			}
		}
	}
}