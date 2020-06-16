import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n =scan.nextInt();
		String[] s = new String[n];
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			s[i]=scan.nextLine();
		}
		boolean flag = false;
		for(int i=0;i<n;++i)
		{
			String x = s[i];
			for(int j=0;j<4;j+=3)
			{
				if(x.charAt(j)==x.charAt(j+1) && x.charAt(j)=='O')
				{
					flag = true;
					if(j==0)
					{
						s[i]="++"+x.substring(2,5);
					}
					else
					{
						s[i]=x.substring(0,3)+"++";
					}
					break;
				}
			}
			if(flag)
				break;
		}
		if(flag)
		{
			System.out.println("YES");
			for(int i=0;i<n;i++)
			{
				System.out.println(s[i]);
			}
		}
		else
			System.out.println("NO");
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			//int t= scan.nextInt();
			int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}