package leetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class plusOne {

	public static void main(String[] args) {
		int digits[]= {9,9,9};
		  BigInteger value = new BigInteger("0");
		// TODO Auto-generated method stu
		 for(int i=0;i<digits.length;i++){
			    value=value.multiply(BigInteger.valueOf(10));
			    value=value.add(BigInteger.valueOf(digits[i]));
			    }
		 value=value.add(BigInteger.valueOf(1)); 
		 System.out.println(value); 
	}

}
