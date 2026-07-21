import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merged = new int[m + n];

        // Copy valid elements from nums1
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        // Copy elements from nums2
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        // Copy merged array back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }
    }
}