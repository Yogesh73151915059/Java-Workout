import java.util.*;

public class Main {
	 static int[] Sorting01(int n,int[] arr){
        // Your code here
		 for(int i=0;i<n;i++){
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
		 return arr;
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
