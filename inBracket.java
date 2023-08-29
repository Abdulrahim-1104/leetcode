package leetCode;

public class inBracket {
	public static String solution(String inputString) { 
int max=Integer.MAX_VALUE;
String result="";
boolean bool=false;
for(int i=0;i<inputString.length();i++) {
	 if(inputString.charAt(i)==')' || inputString.charAt(i)=='(' && bool) {
		int j=i-1;
		while(true) {
			if(j==max) {
				break;
			}
			result+=inputString.charAt(j);
			j--;
		}
		max=Integer.MAX_VALUE;
	}
	 if(inputString.charAt(i)=='(') {
			max=i;
			bool=true;
		}
	if(max>i) {
		result+=inputString.charAt(i);
	}
}
return result;
	}
	public static String solutions(String inputString) {
		String result="";
		boolean bool=false;
		int index=0;
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i)=='(') {
				bool=true;
				index=i;
			}
			else if(inputString.charAt(i)==')'&&bool) {
				bool=false;
				result=result.substring(0,(result.length()-(i-index)+1));
				int j=i-1;
				while(true) {
					if(inputString.charAt(j)=='(') break;
					result+=inputString.charAt(j);
					j--;
				}
			}
			else if(inputString.charAt(i)!='(' && inputString.charAt(i)!=')') {
				result+=inputString.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="foo(bar(baz))bilm";
       System.out.println(solutions(str)); 
	}

}
