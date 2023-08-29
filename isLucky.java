package leetCode;

public class isLucky {
public static boolean islucky(int n) {
	String s=String.valueOf(n);
	int count1=0;
	int count2=0;
	int half=(s.length()/2);
	int len=s.length()-1;
	for(int i=0;i<half;i++) {
		count1+=(s.charAt(i)-48);
		count2+=(s.charAt(len-i)-48);
	}
	boolean bool=count1==count2?true:false;
	return bool;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=1230;
      System.out.println(islucky(n));
	}

}
