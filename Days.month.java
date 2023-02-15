import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        //Write your code here, take input as well
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int year=sc.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0)){
			if(m==2){
				System.out.println(29);
			}
		}else{
			if(m==2){
				System.out.println(28);
			}else if(m<=7&&m%2!=0){
				System.out.println(31);
			}else{
				System.out.println(30);
			}
		}
    }
}
