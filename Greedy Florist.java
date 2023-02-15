import java.util.*;
import java.io.*;

class Solution{
    static int minCost(int []cos, int n, int k){
        //Write your code here
		int mx=Integer.MIN_VALUE;
		int ans=0;
		Arrays.sort(cos);
		if(k>=n){
			for(int i=0;i<n;i++){
				ans+=cos[i];
			}
		}else{
			int x=0;
			while(n>0){
			for(int i=0;i<k;i++){
				ans+=(x+1)*cos[n-1];
				n--;
				if(n==0){
					break;
				}
			}
				x++;
		}
		}
		return ans;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = input.nextInt();
        }        
        System.out.println(Solution.minCost(cost,n,k));
    }
}
