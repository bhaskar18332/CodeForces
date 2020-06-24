import java.io.*;
import java.util.*;

public class C
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		if(n==1)
			System.out.println("FastestFinger");
		else if(n==2)
			System.out.println("Ashishgup");
		else if(n%2!=0)
			System.out.println("Ashishgup");
		else
		{
			ArrayList<Integer> a = new ArrayList<>();
			int e=0;
			int o=0;
			for(int i=1;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					if(n/i==i)
					{
						a.add(i);
						if(i!=1)
						{
						if(i%2!=0)
							o++;
						else
							e++;
						}
					}
					else
					{
						a.add(i);
						if(i!=1)
						{
						if(i%2!=0)
							o++;
						else
							e++;	
						}
						a.add(n/i);
						if(i!=1)
						{
						if((n/i)%2!=0)
							o++;
						else
							e++;
						}
					}
				}
			}
			if(o==0 || (e==1 && o==1))
				System.out.println("FastestFinger");
			else
				System.out.println("Ashishgup");
		}
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			int t= scan.nextInt();
			//int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}