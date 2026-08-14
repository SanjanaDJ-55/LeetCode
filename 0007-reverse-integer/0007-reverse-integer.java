class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;

        // Convert to positive safely using long
        long num = Math.abs((long) x);

        // Store digits in an array
        int[] arr = new int[10];
        int i = 0;

        while (num > 0) {
            arr[i] = (int)(num % 10);
            num = num / 10;
            i++;
        }

        // Build reversed number
        long reverse = 0;

        for (int j = 0; j < i; j++) {
            reverse = reverse * 10 + arr[j];
        }

        if (negative) {
            reverse = -reverse;
        }

        // LeetCode requires 0 if overflow occurs
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverse;
    }
}