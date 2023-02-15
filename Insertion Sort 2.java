import java.util.*;

public class Main {

    public static void insertionSort(int arr[], int n) {
        // write code here
		for(int i=1;i<n;i++){
			int el=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>el){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=el;
			for(int a:arr){
				System.out.print(a+" ");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }
}
