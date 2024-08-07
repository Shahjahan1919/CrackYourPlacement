class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[nums.length / 2];
        int ct = 0;
        for (int i : nums) {
            ct += Math.abs(i - mid);
        }
        return ct;

    }

}
