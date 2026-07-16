class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l =1;
        int r =x;
        while(l<=r){
            int mid = l+(r-l)/2;
            long sqrt = (long)mid*mid;
            if(sqrt == x){
                return mid;
            }
            else if(x>sqrt){
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return r;
    }
}