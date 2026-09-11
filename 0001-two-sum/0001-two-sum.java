

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            int compelement = target - nums[i];
            if(hm. containsKey(compelement)){
                return new int[]{hm.get(compelement), i};

            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}