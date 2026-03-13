class Solution {
    public int pivotIndex(int[] nums) {
        //rightSum=0 leftsum = totalsum-nums[i]-rightsum
        int rightSum =0;
        int totalSum=0;
        int leftSum=0;
        for (int num:nums){
            totalSum+=num;
        }
        for(int i=0;i<nums.length;i++){
            rightSum=totalSum-nums[i]-leftSum;
        if(rightSum==leftSum){
            return i;
        }
        leftSum+=nums[i];
            
        }
        return -1;
        
    }
}