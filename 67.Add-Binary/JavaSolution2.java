// Given two binary strings, return their sum (also a binary string).

// For example,
// a = "11"
// b = "1"
// Return "100".
public class Solution {
    public String addBinary(String a, String b) {
        // we only process the situation when b is shorter.
        // if a is shorter, switch two strings.
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        
        //initialize variable
        //pointer to the tails of a and b so that we can add
        //number in same digit level
        //carries to save carries if 1+1 = 10
        //rst to store result
        int pa = a.length()-1;
        int pb = b.length()-1;
        int carries = 0;
        String rst = "";
        
        //since b is shorter, we process b first otherwise we'll get out of range
        //parse two tail digit to 0 and add them together with carries from last time
        //add the result to result. Notice here we are adding to the left of result. 
        //Since we are going larger and larger with resect to digit level
        //process carries after we add them on
        //decrease pointers
        while(pb >= 0){
            int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
            pb --;
        }
        
        //do the same for pa only since b is done
        while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
        }       
        
        //if we have a carry digit left, we add them to final result
        if (carries == 1)
            rst = "1" + rst;
            
        //Congratulations. Good to go!!!
        return rst;
    }
}
