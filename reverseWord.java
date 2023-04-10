package String;
import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String str=WordRev(a);
   System.out.println(str);
	}

	private static String WordRev(String s) {
		
		int len=s.length();
        String ans="";
        String tem="";
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=' '){
                tem+=s.charAt(i);
            }else{
                if(tem.length()>0){
                    ans=tem+" "+ans;
                }
                tem="";
            }
            
        }
        if(tem.length()>0){
            ans=tem+" "+ans;
        }
        return ans.trim();
	}

}
