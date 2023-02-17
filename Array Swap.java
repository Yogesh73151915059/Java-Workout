import java.io.*;
import java.util.*;
public class Main {
    static String arraySwaps(int arr[],int n,int x)
    {
        // Your code here
		int c=0;
        for(int i=0;i<n;i++){
			if(arr[i]>=1){
			for(int j=i+1;j<n;j++){
				if((arr[j]<=n)&&Math.abs(i-j)>=x){
					int tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
					c++;
				}
			}
		}
		}
		if(c>0){
			return "YES";
		}else{
			return "NO";
		}
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        String ans = arraySwaps(a,n,x);
        System.out.println(ans);
    }
}
