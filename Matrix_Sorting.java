import java.util.*;

class Solution{
     private static int[][] transpose(int[][] mat, int n, int m) {
		// TODO Auto-generated method stub
		int tran[][]=new int[m][n];

    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			tran[j][i]=mat[i][j];
    		}
    		
    	}
		return tran;
	}
    public static void sortCol(int[][] mat, int n, int m){
        // Write your code and print here
		mat=transpose(mat,n,m);
    	for(int i=0;i<m;i++) {
    		Arrays.sort(mat[i]);
    	}
    	mat=transpose(mat,m,n);

    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			System.out.print(mat[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    }
    }


public class Main {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          Solution.sortCol(mat, n, m);
      
        }
}
