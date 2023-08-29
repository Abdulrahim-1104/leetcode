package leetCode;

import java.util.Arrays;

public class boxBlur {
public static int[][] solution(int inputArray[][]){
	int n=inputArray.length;
	int result[][]=new int[n-2][inputArray[0].length-2];
	for(int i=0;i<n-2;i++) {
		for(int j=0;j<inputArray[0].length-2;j++) { 
			int sum=0;
			for(int k=i;k<i+3;k++) { 
				for(int l=j;l<j+3;l++) {
					sum+=inputArray[k][l];
				}
			}
			result[i][j]=sum/9;
		}
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{36,0,18,9}, 
                     {27,54,9,0}, 
                     {81,63,72,45}}; 
      //  System.out.println(Arrays.toString(arr)); 
       System.out.println(Arrays.deepToString(solution(arr)));
	} 

}
