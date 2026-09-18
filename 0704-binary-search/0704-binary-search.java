class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i =0;
        int j =n -1;
        while(i<=j){
            int m = i+(j-i)/2;
            if(target == nums[m]){
                return m;
            }
            else if(target>nums[m]){
                i = m+1;
            }
            else{
                j=m-1;
            }
        }
        return -1;
       }
       
    }
