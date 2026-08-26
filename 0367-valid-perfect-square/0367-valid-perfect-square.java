class Solution {
    public boolean isPerfectSquare(int num) {
       int i =1;
       int j = num;
       while(i<=j){
        int m = i+(j-i)/2;
        long sqrt = (long)m*m;
        if(num == sqrt){
            return true;
        }
        else if(num>sqrt){
            i = m+1;
        }
        else{
            j=m-1;
        }
       }
       return false;
    }
}

