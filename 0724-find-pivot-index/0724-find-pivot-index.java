class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int totalSum=0;
        for(int sum:nums){
            totalSum+=sum;
        }
        for(int i=0;i<nums.length;i++){
        rightSum=totalSum-nums[i]-leftSum;
        if(leftSum==rightSum){
            return i;
        }
        leftSum+=nums[i];
        }
        return -1;

        
}
}