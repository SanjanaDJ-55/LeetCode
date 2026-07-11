class Solution {
    public int search(int[] nums, int target) {
        //linear search algorithm
        int n =nums.length;
        for(int i =0;i<=n-1;i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}