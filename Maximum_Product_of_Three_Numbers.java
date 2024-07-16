class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int n1 = nums[0] * nums[1] * nums[n - 1];

        int n2 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int res = Math.max(n1, n2);

        return res;

    }
}