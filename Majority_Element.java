class Solution {
    public int majorityElement(int[] nums) {
        // not required HashMap<Integer,Integer> var = new HashMap<>();

        // MOORE VOTING ALGORITHM

        int count = 0;
        int cand = 0;
        for (int num : nums) {
            if (count == 0) {
                cand = num;
            }
            if (cand == num) {
                count++;
            } else {
                count--;
            }
        }
        return cand;

    }

}
