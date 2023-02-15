import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting021(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }

	static int[] Sorting021(int n,int[] arr){
        // Write your code here
		int c0=0;
		int c2=0,c1=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				c0++;
			}else if(arr[i]==2){
				c2++;
			}else{
				c1++;
				 }
		}
		for(int i=0;i<c0;i++){
			arr[i]=0;
		}
		for(int i=c0;i<(c0+c2);i++){
			arr[i]=2;
		}
		for(int i=c0+c2;i<n;i++){
			arr[i]=1;
		}
		return arr;
    }
}
