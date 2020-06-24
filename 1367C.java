import java.io.*;
import java.util.*;

public class Main
{
	static int lowerIndex(int arr[], int n, int x) 
    { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] >= x) 
                h = mid - 1; 
            else
                l = mid + 1; 
        } 
        return l; 
    }
	static int upperIndex(int arr[], int n, int y) 
    { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] <= y) 
                l = mid + 1; 
            else
                h = mid - 1; 
        } 
        return h; 
    }
	static int countInRange(int arr[], int n, int x, int y) 
    { 
        // initialize result 
        int count = 0; 
        count = upperIndex(arr, n, y)-lowerIndex(arr, n, x) + 1; 
        return count; 
    }
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.next();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			char c = s.charAt(i);
			if(c!='0')
			{
				a.add(i);
			}
		}
		int l = a.size();
		int[] arr = new int[a.size()];
		for(int i=0;i<l;i++)
		{
			arr[i]=a.get(i);
		}
		Arrays.sort(arr);
		long ans=0;
		int i=0;
		while(i<n)
		{
			if(countInRange(arr,l,i-k,i+k)==0)
			{
				ans++;
				i=i+k+1;
			}
			else
				i++;
		}
		System.out.println(ans);
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