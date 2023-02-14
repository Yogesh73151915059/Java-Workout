import java.util.*;

public class Main {
    public static int[] SelectionSort(int[] arr) {
        // Write your code here
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min=arr[i];
			int min_in=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<min){
					min=arr[j];
					min_in=j;
				}
			}
			int tem=arr[i];
			arr[i]=arr[min_in];
			arr[min_in]=tem;
		}
		return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
