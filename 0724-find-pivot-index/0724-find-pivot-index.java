class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightsum =0;
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        for(int i =0;i<nums.length;i++){
            rightsum =totalSum-nums[i]-leftSum;
            if(rightsum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
        
}
}