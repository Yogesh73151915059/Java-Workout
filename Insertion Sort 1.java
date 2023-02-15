import java.util.*;
import java.io.*;

public class Main {
    
    static void insertionSort1(int arr[],int n){
               //Write your code here
		for(int i=1;i<n;i++){
			int el=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>el){
				arr[j+1]=arr[j];
				
				for(int a:arr){
				System.out.print(a+" ");
			}
				System.out.println();
				j--;
			}
		
			arr[j+1]=el;
		}
			for(int a:arr){
				System.out.print(a+" ");
			}
		
			
			
		
        }

        	
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }   
        insertionSort1(a,n);
    }
}
