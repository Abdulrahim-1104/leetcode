package leetCode;

import java.util.Arrays;

public class borderString {
	static String[] solution(String[] picture) {
		String result[]=new String[picture.length+2];
		String star="";
		for(int i=0;i<picture[0].length()+2;i++) {
			star+="*";
		}
		result[0]=star;
		result[picture.length+1]=star;
		for(int i=0;i<picture.length;i++) {
			result[i+1]="*"+picture[i]+"*";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"aa","**","zz"};
System.out.println(Arrays.toString(solution(s)));
	}

}
