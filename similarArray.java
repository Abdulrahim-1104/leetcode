package leetCode;

import java.util.Arrays;

public class similarArray {
	static boolean solution(int[] a, int[] b) {
		int count=0;
      if(a.length!=b.length) return false;
      for(int i=0;i<a.length;i++) {
    	  int val=a[i];
    	  boolean contains = Arrays.stream(b).anyMatch(x -> x == val);
    	  if(!contains) return false;
    	  if(a[i]!=b[i]) count++;
    	  if(count>2) return false;
      }
      return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2};
        int b[]= {};
        System.out.println(solution(a,b));
	}

}
