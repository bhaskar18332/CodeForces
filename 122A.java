import java.io.*;
import java.util.*;
 
public class A
{
	public static boolean check(int x)
	{
		if(x<10 && (x==4 || x==7))
			return true;
		else if((x > 10 && x < 100) && ((x/10 == 4 || x/10 == 7) && (x%10 == 4 || x%10 ==7)))
			return true;
		else if((x > 100 && x < 1000) && ((x%10 == 7 || x%10 == 4)) && (x/10 == 44 || x/10 == 47 || x/10 == 77 || x/10 == 74))
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean flag = true;
		for(int i=1;i<1000;i++)
		{
			if(check(i))
			{
				if(n%i==0)
				{
					System.out.println("YES");
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("NO");
	}
}