import java.io.*; 
import java.util.*;
import java.util.Scanner; 
 
public class Main { 
	public static void main (String[] args) 
	{ 
		
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			int N = scan.nextInt();
			int ans =1;
			while(N!=1)
			{
				if(N%2==0)
					N/=2;
				else
				{
					N-=1;
					ans+=1;
				}
			}
			System.out.println(ans);
			
		}
		}
	}