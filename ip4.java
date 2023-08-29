package leetCode;

import java.util.Arrays;

public class ip4 {
public static boolean solution(String inputString) {
	 String s[]=inputString.split("[.]");
	 int dot=0;
	 if(s.length>4) return false;
	 for(int i=0;i<inputString.length();i++) {
		 if(inputString.charAt(i)=='.') dot++;
	 }
	 for(int i=0;i<s.length;i++) {
		 if(Integer.valueOf(s[i])>255 || s[i].charAt(0)==0) return false;
	 }
	 if(dot>=s.length) return false;
	 return true;
}
public static boolean solutions(String inputString) {
	String s[]=inputString.split("\\.");
	int count=0;
	String str="";
	for(int i=0;i<s.length;i++) {
		if(s[i]=="") count++;
		else if(s[i].charAt(0)=='0' && s[i].length()>1) return false;
		else if (!s[i].matches("[0-9]+")) return false;
		else if(Integer.valueOf(s[i])>255) return false;
		else
		str+=s[i];
	}
	if((inputString.length()-str.length())>=s.length-count) return false;
	if((s.length-count)>4 && (s.length-count)<4) return false;
	return true;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str= "129380129831213981.255.255.255"; 
//   System.out.println(solutions(str));;	 
   int a=Integer.parseInt("33333333333333");
   System.out.println(a);
	}

}
