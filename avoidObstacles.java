package leetCode;

import java.util.Arrays;

public class avoidObstacles {
public static int solution(int[] inputArray) {
	Arrays.sort(inputArray);
	int val=2;
	while(true) {
		if(val>inputArray[inputArray.length-1]) return val;
		boolean bool=true;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]%val==0) {
				bool=false;
				break;
			}
		}
		if(bool) break;
		val++;
	}
	return val;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 8, 9, 13, 14};
		System.out.println(solution(arr));

	}

}
