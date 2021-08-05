class Solution {
    public int reverse(int x) {
        // initialize rev variable for storage reverse number
        int rev = 0;
        
        while ( x != 0) {
        // do division while number not 0
            int reverse = x % 10;
            //updating rev variable with turned number 
            rev = rev * 10 + reverse;
            x /= 10;
        }
        
        return rev;
    }
}
