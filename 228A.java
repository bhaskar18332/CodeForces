import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext())
		{
			HashSet<Integer> h = new HashSet<>();
			for(int i=0;i<4;i++)
			{
				h.add(scan.nextInt());
			}
			System.out.println(4-h.size());
		}
	}
}