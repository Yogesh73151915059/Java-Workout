//*Two Sum in an Array
// Given an integer array nums and an integer target

// Find indices of the two numbers from the array such that they add up to target.

// NOTE: It is always ensured that two elements add up to the given target. Return the output in increasing order.

// Input Format
// First line contains two integers n and target respectively.

// Second line contains n space separated integers representing array nums.

// Output Format
// Print indices of the two numbers that adds up to the target.

// Example 1
// Input

// 4 9
// 2 7 5 11
// Output

// 0 1
// Explanation

// nums[0] + nums[1] == 9, we print 0 1

// Example 2
// Input

// 3 6
// 5 2 4
// Output

// 1 2
// Explanation

// nums[1] + nums[2] == 6, we print 1 2
import java.io.*;
import java.util.*;

class Accio{
    public int[] twoSum(int[] nums, int t) {
        //Write code here
		int n=nums.length;
		int arr[]=new int [2];
		for(int i=0;i<n;i++){
			int j=n-1;
			while(i<j){
				if(nums[i]+nums[j]==t){
					arr[0]=i;
					arr[1]=j;
					return arr;
					//break;
				}
				--j;
			}
		}
		return arr;
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        Accio obj = new Accio();
        int[] arr = obj.twoSum(nums,target);
        System.out.print(arr[0]);
        System.out.print(' ');
        System.out.print(arr[1]);
    }
}
