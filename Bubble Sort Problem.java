import java.io.*;
import java.util.*;

public class Main {
    static void bubbleSort(int a[], int n)
    {
        //Write your code here
		int c=0;
	  for(int i=0;i<n-1;i++){
		  for(int j=0;j<n-i-1;j++){
			  if(a[j]>a[j+1]){
				  c++;
				  int tem=a[j];
				  a[j]=a[j+1];
				  a[j+1]=tem;
			  }
		  }
	  }
		System.out.println(c);
		System.out.println(a[0]);
	    System.out.println(a[n-1]);
		

	}  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
       bubbleSort(arr1, n);
    }
}
