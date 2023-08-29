package leetCode;

public class commonChar {
public static int commonchar(String s1,String s2) {
 int count=0;
 for(int i=0;i<s1.length();i++) {
	 for(int j=0;j<s2.length();j++) {
		 if(s1.charAt(i)==s2.charAt(j)) {
			 s2=s2.substring(0,j)+s2.substring(j+1,s2.length());
			 count++;
			 break;
		 }
	 }
 }
 return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1 = "aabcc";
    String s2 = "adcaa";
    System.out.println(commonchar(s1,s2));
	}

}
