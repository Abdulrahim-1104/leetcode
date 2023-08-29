package leetCode;

import java.util.Arrays;

public class teamSum {
  public static int[] solution(int[] a) {
        int result[]= new int[2];
        for(int i=0,j=1;i<a.length || j<a.length;i+=2,j+=2) {
        	if(i<a.length) result[0]+=a[i];
        	if(j<a.length) result[1]+=a[j];
        }
        return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(a)));
	}

}
