class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int lsum = 0;
        int rsum = 0;
        // sliding window approach // 2 pointers approach

        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        int sum = lsum;
        int j = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[j];
            j--;
            sum = Math.max(sum, lsum + rsum);
        }

        return sum;

    }
}