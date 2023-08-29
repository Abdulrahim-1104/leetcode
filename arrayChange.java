package leetCode;

import java.util.HashSet;

public class arrayChange {
 public static int solution(int inputArray[]) {
	 HashSet<Character> set = new HashSet<>();  
	
	 int count=0;
	 for(int i=0;i<inputArray.length-1;i++) {
		 if(inputArray[i]>=inputArray[i+1]) {
			 int difference=inputArray[i]-inputArray[i+1]+1;
			 count+=difference;
			 inputArray[i+1]+=difference;
		 }
	 }
	 return count;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1000,0,-2,0};
		System.out.println(solution(arr));

	}

}
