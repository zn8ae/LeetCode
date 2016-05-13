import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        //Java has BigInteger Class 
        //Constructor can take in String input type and specify binary
        //BigInteger can store over 32bits value
        
        BigInteger aValue = new BigInteger(a, 2); // turn a to binary biginteger
	BigInteger bValue = new BigInteger(b, 2);// turn b to binary biginger
	BigInteger sum = new BigInteger("0", 2);// initialize sum as binary big ineger
	sum = aValue.add(bValue);//sum = a + b
	return sum.toString(2);//change sum to string. Keep binary. Done!
		
		
    }
}
