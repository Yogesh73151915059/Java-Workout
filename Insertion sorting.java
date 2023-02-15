import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }
	 static void insertionSort(int a[], int n)
    {
        //Write your code here
		for(int i=1;i<n;i++){
           int el=a[i];
			int j=i-1;
			while(j>=0&&a[j]>el){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=el;
				
			}
		for(int s:a){
			System.out.print(s+" ");
		}
		}
    }
