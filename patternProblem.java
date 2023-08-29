package leetCode;

public class patternProblem {
public static void pattern1(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		if(j==i || i==(n+1)-j ) {
			if(i>(n/2)) System.out.print(j);
			else
			System.out.print((n+1)-j);  
		}
		else {
			System.out.print(" ");
		}
		}
		System.out.println("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         pattern1(7);
	}

}
