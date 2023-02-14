import java.util.*;

public class Main { 
     static char MaximumFrequencyChar(String s) {
        //Write your code here
		 char arr[]=s.toCharArray();
		 Arrays.sort(arr);
		 int n=arr.length;
		 int i=0,j=0;
		 int c=0,max=0;
			char maxi=0;
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
			 if(c>max){
				 max=c;
				 maxi=arr[i];
				 
			 }
			 i=j;
		 }
		 return maxi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}
