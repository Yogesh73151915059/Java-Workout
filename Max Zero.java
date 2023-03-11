import java.util.*;

class Solution {
    public void zeroMax(int n, int[] arr) {
        // write code here
		int tem=0;
		for(int i=0;i<n;i++){
			tem=0;
			if(arr[i]==0){
			for(int j=i+1;j<n;j++){
				
					if(arr[j]%2!=0){
						if(arr[j]>tem){
							tem=arr[j];
						arr[i]=arr[j];	
						}
					}	
				}
			}
		}
	//	for(int i=0;i<n;i++){
		//	System.out.print(arr[i]+" ");
		//}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        Obj.zeroMax(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
