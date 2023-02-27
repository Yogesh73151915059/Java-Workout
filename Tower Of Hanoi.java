import java.io.*;
import java.util.*;
class Main {
	static void toh(int N, int source, int dis, int help) {
        //Write code here
		if(N==0)
			return;
		 toh(N-1,source,help,dis);
		System.out.println("move disk "+N+" from rod "+source+" to rod "+dis);
		 toh(N-1,help,dis,source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        N = sc.nextInt();

        toh(N, 1, 3, 2);

        sc.close();
    }
}

