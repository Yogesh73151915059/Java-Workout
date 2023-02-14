import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		int in=sc.nextInt();
		for(int i=0;i<a-1;i++){
            int min=arr[i];
			int min_in=i;
			for(int j=i+1;j<a;j++){
				if(arr[j]<min){
					min=arr[j];
					min_in=j;
				}
			}
			int tem=arr[i];
			arr[i]=arr[min_in];
			arr[min_in]=tem;
		}
		  for(int i=0;i<a;i++){
			  if(arr[i]==in){
			System.out.print(i);
			  }
		  }
    }
}
