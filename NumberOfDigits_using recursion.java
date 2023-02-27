import java.util.*;
public class Main
{
    static int NumberOfDigits(int n){
    if(n==0){
        return 0;
    }
    return 1+NumberOfDigits(n/10);
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
     int result=NumberOfDigits(n);
     System.out.println(result);
	}
}
