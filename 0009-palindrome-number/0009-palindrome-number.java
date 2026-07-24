class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0 || x==1){
            return true; 
        }
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int og = x;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
            if (og == rev) {
                return true;
            }
            
        }

        return false;

    }
}