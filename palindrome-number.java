public class Solution {
    public boolean isPalindrome(int x) {
        //negative numbers are not palindrome
		if (x < 0)
			return false;
 
		// initialize how many zeros
		int rev = 1;
		while (x / rev >= 10) {
			rev *= 10;
		}
 
		while (x != 0) {
			int left = x / rev;
			int right = x % 10;
 
			if (left != right)
				return false;
 
			x = (x % rev) / 10;
			rev /= 100;
		}
 
		return true;
    }
}
