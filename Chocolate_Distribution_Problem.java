class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (n < m) {
            return -1;
        }

        ArrayList<Integer> al = new ArrayList<>(a);
        Collections.sort(al);

        long ans = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int res = al.get(i + m - 1) - al.get(i);
            if (res < ans) {
                ans = res;
            }
        }

        return ans;
    }
}