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
			long ans =0;
			for(int i=0;i<n;i++)
			{
				String s = scan.next();
				if(s.equals("Icosahedron"))
					ans+=20;
				if(s.equals("Tetrahedron"))
					ans+=4;
				if(s.equals("Cube"))
					ans+=6;
				if(s.equals("Octahedron"))
					ans+=8;
				if(s.equals("Dodecahedron"))
					ans+=12;
			}
			System.out.println(ans);
		}
	}
}