import java.io.*;
import java.util.*;
public class Main {
  
  public static String solution(String str) {
        StringBuilder ans=new StringBuilder();
	  int n=str.length();
	  for(int i=0;i<n-1;i++){
		  ans.append(str.charAt(i));
		int c=(int)(str.charAt(i+1)-str.charAt(i));
			   ans.append(c);
	  }
	  ans.append(str.charAt(n-1));
	  return ans.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}
