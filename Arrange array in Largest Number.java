import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static String largestNumber(final int[] A) {
        // your code here
		int n=A.length;
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<n;i++){
			arr.add(Integer.toString(A[i]));
		}
		Collections.sort(arr,(a,b)->(b+a).compareTo(a+b));

		StringBuilder s=new StringBuilder();
		for(int i=0;i<n;i++){
			s.append(arr.get(i));
		}
		if(s.charAt(0)=='0'){
			return "0";
		}else{
			return s.toString();
		}
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(largestNumber(arr));
	}
}
