import java.io.*;
import java.util.*;

class Main{

    static boolean solve(int arr[],int n){
        //Write your code here
		int temp[]=new int[n];
		for(int i=0;i<n;i++){
			temp[i]=arr[i];
		}
		Arrays.sort(temp);
		int s=-1,e=-1;
		for(int i=0;i<n;i++){
			if(arr[i]!=temp[i]){
				s=i;
				break;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(arr[i]!=temp[i]){
				e=i;
			}
		}
		if(s ==-1){
			return true;
		}
		while(s<e){
			int swap=arr[s];
			arr[s]=arr[e];
			arr[e]=swap;
			++s;
			--e;
		}
		boolean sort= true;
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				sort=false;
				break;
			}
		}
		return sort;
    }
	
    public static void main(String args[])throws IOException{    
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];

        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        boolean ans=solve(arr,N);
        
        if(ans==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
