import java.io.*;
import java.util.*;

public class Main {
    static String strangeString(int n) {
        //Write your code here
	   StringBuilder ans=new StringBuilder();
           int j=0;
		for(int i=0;i<n;i++){
			
			char c=(char)(j+97);
			if(i%2==0){
			ans.insert(0,Character.toString(c));
				}else{
				ans.append(c);
				}
			j++;
			if(j>25){
				j=0;
			}
		}
		return ans.toString();
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}
