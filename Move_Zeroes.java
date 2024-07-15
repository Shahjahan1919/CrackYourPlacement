class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int j = index; j < n; j++) {
            nums[j] = 0;
        }

    }
}
