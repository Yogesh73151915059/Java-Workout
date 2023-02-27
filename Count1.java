import java.util.*;
public class Main
{
    static int Count1(int n){
    if(n==0){
        return 0;
    }
    return (n%10==1? 1:0)+Count1(n/10);
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
     int result=Count1(n);
     System.out.println(result);
	}
}
