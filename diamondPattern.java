package leetCode;

public class diamondPattern {
public static void diamond(int n) {
	for(int i=0;i<n*2;i++) {
		int val=i;
		if(i>((n*2)-1)/2)val=(n*2-2)-val; 
		int start=((n*2)-1)/2 -val;
		int end=((n*2)-1)/2 + val;
		for(int j=0;j<n*2;j++) {
			if(j>=start && j<=end)System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        diamond(10);
	}

}
