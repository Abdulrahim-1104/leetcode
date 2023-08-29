package leetCode;

public class variableName {
	public static boolean solution(String name) {
		if(name.charAt(0)>=48 && name.charAt(0)<=57) return false;
		for(int i=1;i<name.length();i++){
		    if(!((name.charAt(i)>=65 && name.charAt(i)<=90) || (name.charAt(i)>=97 && name.charAt(i)<=122)  || name.charAt(i)==95 ||(name.charAt(i)>=48 && name.charAt(i)<=57) )){
		        return false;
		    }
		}
		return true;
	}
public static void main(String args[]) {
	System.out.println(solution("var__1__Int"));
	char a='m';
	System.out.println((int)a);
	String s="";
	s+=a;
	System.out.println(s);
	char b='C';
	System.out.println(b-64);
	System.out.println(bool);
}
}
