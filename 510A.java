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
			int m = scan.nextInt();
			boolean flag = true;
			for(int i=0;i<n;i++)
			{
				if(i%2!=0)
				{
					if(flag)
					{
						for(int j=0;j<m;j++)
						{
							if(j==m-1)
								System.out.print("#");
							else
								System.out.print(".");
						}
						flag = false;
					}
					else
					{
						for(int j=0;j<m;j++)
						{
							if(j==0)
								System.out.print("#");
							else
								System.out.print(".");
						}
						flag = true;
					}
				}
				else
				{
					for(int j=0;j<m;j++)
					{
						System.out.print("#");
					}
				}
				System.out.println();
			}
		}
	}
}