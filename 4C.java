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
			ArrayList<Integer> a = new ArrayList<>();
			HashMap<String, Integer> map = new HashMap<>();
			for(int i=0;i<n;i++)
			{
				String s = scan.next();
				if(map.containsKey(s))
				{
					int v = map.get(s);
					System.out.println(s+""+a.get(v));
					a.set(v,a.get(v)+1);
				}
				else
				{
					map.put(s,a.size());
					a.add(1);
					System.out.println("OK");
				}
			}
		}
	}
}