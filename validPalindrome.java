package leetCode;

import java.util.HashSet;

public class validPalindrome {
public static boolean solution(String inputString) {
	HashSet<Character> set = new HashSet<>();
    for(int i=0;i<inputString.length();i++) {
    	set.add(inputString.charAt(i));
    }
	int odd=0;
	for(int i=0;i<set.size();i++){
	    int count=0;
	    for(int j=0;j<inputString.length();j++){
	    }
	    if(count%2!=0){
	        odd++;
	    }
	}
	if(inputString.length()%2==0 && odd>0){
	    return false;
	}
	if(inputString.length()%2!=0 && odd>1){
	    return false; 
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(-2-(-2));
	}

}
