package leetCode;

import java.util.Arrays;

public class heightSort {
	public static int[] solution(int[] a) {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]!=-1) {
    		   min=i;
    		   boolean bool=false;
    		   for(int j=i+1;j<a.length;j++) {
    			   if(a[j]<a[min] && a[j]!=-1) {
    				   min=j;
    				   bool=true;
    			   }
    		   } 
    		 if(bool) {
    			 int temp=a[i];
       		   a[i]=a[min]; 
       		   a[min]=temp;
    		 }
    	   }
       }
       return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {-1, 150, 190, 170, -1, -1, 160, 180};
       System.out.println(Arrays.toString(solution(a)));
       
	}

}
