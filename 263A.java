import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			int x=0;
			int y=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					int a = scan.nextInt();
					if(a==1)
					{
						x=i;y=j;
					}
				}
			}
			System.out.println((int)(Math.abs(x-2)+Math.abs(y-2)));
		}
	}
}