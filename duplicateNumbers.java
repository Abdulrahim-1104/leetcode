package leetCode;

import java.util.Arrays;

public class duplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int nums[]= {0,0,0,1,1,2,2,3,3,4};
		int len=nums.length;
		   int count=0;
	        for(int i=0;i<len-1;i++){
	            if(nums[i]==nums[i+1]){
	                count++;
	                for(int j=i+1;j<len;j++){
	                    nums[j-1]=nums[j];
	                }
	            i--;
	            len--;
	            }
	        }
	        int result=nums.length-count;
	        nums=Arrays.copyOfRange(nums, 0, len);
	     
	        for(int i=0;i<nums.length;i++) {
	        	System.out.print(nums[i]+" ");
	        }
	        System.out.println("\n"+result);

	}

}
