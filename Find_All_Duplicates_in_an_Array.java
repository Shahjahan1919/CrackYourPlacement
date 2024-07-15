class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();

        HashSet<Integer> var = new HashSet<>();
        for (int i : nums) {
            if (var.contains(i)) {
                al.add(i);
            } else {
                var.add(i);
            }
        }
        return al;
    }
}