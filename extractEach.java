package leetCode;

import java.util.Arrays;

public class extractEach {
	public static int[] solution(int[] inputArray, int k) {
		int arr[]=new int[inputArray.length-(inputArray.length/k)];
		int count=0;
		for(int i=0;i<inputArray.length;i++){
		    if((i+1)%k!=0){
		        arr[count]=inputArray[i]; 
		        count++;
		    }
		}
		return arr;
		}
	public static int sol(int[] inputArray,int k) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=inputArray.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=inputArray[j]; 
			}
			if(sum>max) max=sum;
		}
		return max;
	}
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(sol(arr,3));  
}
}
