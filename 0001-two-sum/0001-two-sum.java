
class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
       int n = nums.length;
       for(int t = 0;t<n;t++){
        int complement = target - nums[t];
        if(hm.containsKey(complement)){
            return new int[]{hm.get(complement), t};
        }
        hm.put(nums[t], t);
       }
       return new int[]{};
}
}