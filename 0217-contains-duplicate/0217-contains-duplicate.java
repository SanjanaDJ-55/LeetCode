public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int n1 = hs.size();
        if(n1 == n){
            return false;
        }
        return true;
     }
}