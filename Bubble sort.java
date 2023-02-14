import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        // for (int i = 0; i < N; i++) {
        //     System.out.print(arr[i] + " ");
        // }

    }

    public static void bubbleSort(int N, int[] arr) {
        // your code here
		//Arrays.sort(arr);
		for(int i=0;i<N;i++){
			for(int j=0;j<(N-i-1);j++){
				if(arr[j]<arr[j+1]){
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
    }
}
