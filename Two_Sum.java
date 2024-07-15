class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> var = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (var.containsKey(comp)) {
                return new int[] { var.get(comp), i };
            }

            var.put(nums[i], i);
        }
        return new int[0];

    }
}