package leetCode;

public class deposite {
public static int solution(int deposit, int rate, int threshold) {
    int count=0;
    float dup=deposit;
    while(true){ 
        if(dup>=threshold) break;
      float temp=((float)rate/100)*dup; 
        dup+=temp;
        count++;
    }
    return count; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(solution(100,20,170));
	}

}
