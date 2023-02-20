import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double t=sc.nextDouble();
		double r=sc.nextDouble();
		double com=(double)p*(Math.pow((1+(r/100.0)),t));
		System.out.println("Compound intrest = "+com);
	}
}
