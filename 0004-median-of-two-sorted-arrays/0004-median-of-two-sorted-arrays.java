class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
         for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        // Copy arr2
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        Arrays.sort(merged);
        int n = merged.length;
        int l =0;
        int r = n-1;
        int mid = l+(r-l)/2;
        float sum = 0;
        for(int i =0;i<merged.length;i++){
            if(n%2!=0){
                return merged[mid];
            }
            else{
                sum =(float)(merged[mid]+merged[mid+1])/2;
                return sum;
            }


        }
        return 0.0;

        
    }
}