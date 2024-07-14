class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> var = new HashSet<>();

        for(int i : nums) {
            if(var.contains(i)) {
                return i;
                
            } else {
                var.add(i);
                
            }
        }
        return 0;
    }
}