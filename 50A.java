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
			System.out.println((a*b)/2);
		}
	}
}