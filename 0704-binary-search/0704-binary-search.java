class Solution {
    public int search(int[] nums, int target) {
        //binary search
        int i =0;
        int j =nums.length-1;
        while(i<=j){
            int m = i+(j-i)/2;
            if(target==nums[m]){
                return m;
                
            }
            else if(target<nums[m]){
                j=m-1;
            }
            if(target>nums[m]){
               i=m+1;
            }
        }
        return -1;
    }
}