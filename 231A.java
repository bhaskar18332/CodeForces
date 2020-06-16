import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
		{
			int n = scan.nextInt();
			long c=0;
			for(int i=0;i<n;i++)
			{
				int a = 0;
				for(int j=0;j<3;j++)
				{
					int b = scan.nextInt();
					if(b==1)
					{
						a++;
					}
				}
				if(a>=2)
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}
}