import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here
		Arrays.sort(arr);
		int i=0,j=0,c=0,maxi=0,maxc=0;
		while(i<n){
            c=0;
			while(j<n){
				if(arr[i]==arr[j]){
					c++;
				}else{
					break;
				}
				j++;
			}
			if(c>maxc){
				maxc=c;
				maxi=arr[i];
			}
			
			i=j;
		}
        return maxi;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
