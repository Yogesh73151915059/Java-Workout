import java.util.*;

public class Main {
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here
		int n=arr.length;
		int ans[] = new int[n];
		
		for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
			int in=-1;
			for(int j=0;j<n;j++){
				if(arr[i]<arr[j]&&arr[j]-arr[i]<min){
					min=arr[j]-arr[i];
					in=j;
				}
			}
			if(in==-1){
				ans[i]=-10000000;
			}else{
				ans[i]=arr[in];
			}
		}
		return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
