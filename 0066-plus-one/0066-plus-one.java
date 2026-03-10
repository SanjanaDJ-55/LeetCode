class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        //999
        int[] A = new int[digits.length + 1];
        A[0] = 1;
        return A;

    }
}