package leetCode;

public class checkEven {
public static boolean solution(int n) {
	int temp=n;
    while(temp>0) {
       int num=temp%10;
       temp=temp/10;
       if((num&1)==1) return false;
    }
    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(290%10);
		int n=220;
     System.out.println(solution(n)); 
	}

}
