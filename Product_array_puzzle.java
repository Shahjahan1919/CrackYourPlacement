class Solution {
    public static long[] productExceptSelf(int nums[], int n) {

        long[] lp = new long[n];
        long[] rp = new long[n];
        long[] res = new long[n];
        lp[0] = 1;
        rp[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            lp[i] = lp[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rp[i] = rp[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = lp[i] * rp[i];
        }

        return res;
    }
}