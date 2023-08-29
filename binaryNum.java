package leetCode;

import java.math.BigInteger;

public class binaryNum {
    public static BigInteger toDecimal(String s) {
	BigInteger value = new BigInteger("0");
	for(int i=0;i<s.length();i++) {
		if(Integer.valueOf(String.valueOf(s.charAt((s.length()-1)-i)))!=0) { 
			 value=value.add(BigInteger.valueOf(2).shiftLeft(i-1));
		}
	}	
	return value;
}
public static String toBinary(String s) {
	
	int i=0;
	String result="";
	int temp=Integer.valueOf(s);
	while(temp>0) {
		int mod=temp%2;
		temp/=2;
		if(mod!=0) {
			result+="1";
		}
		else {
			result+="0";
		}
		i++;
	}
	return result; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
       String ss="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
       BigInteger val = new BigInteger("0");
       val=toDecimal(s).add(toDecimal(ss));
       
     
	}

}
