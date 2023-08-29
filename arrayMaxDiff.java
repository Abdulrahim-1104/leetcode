package leetCode;

public class arrayMaxDiff {
public static int solution(int inputArray[]) {
	int max=Integer.MIN_VALUE;
	for(int i=1;i<inputArray.length-1;i+=2) {
		if(Math.abs(inputArray[i-1]-inputArray[i])>max) {
			max=Math.abs(inputArray[i-1]-inputArray[i]);
		}
		if(Math.abs(inputArray[i]-inputArray[i+1])>max) {
			max=Math.abs(inputArray[i]-inputArray[i+1]);
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2, -2, -2, -2, -2};
     System.out.println(solution(a));
	}

}
