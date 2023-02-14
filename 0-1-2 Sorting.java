import java.io.*;
import java.util.*;

public class Main {
    static void zero_one_two_sorting(int[] arr){
        // Write your code here
		int n=arr.length;
		for(int i=0;i<n-1;i++){
              int min=arr[i];
				  int in=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<min){
					min=arr[j];
					in=j;
				
			}
			
			}
			int tem=arr[i];
			arr[i]=arr[in];
			arr[in]=tem;
		}
		// for(int i=0;i<n;i++){
		// 	System.out.print(arr[i]+" ");
		// }
    
	}
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        zero_one_two_sorting(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}
