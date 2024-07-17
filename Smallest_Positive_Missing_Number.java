class Solution {
    static int missingNumber(int arr[], int size) {
        boolean[] present = new boolean[size + 1];
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0 && arr[i] <= size) {
                present[arr[i]] = true;
            }
        }

        for (int i = 1; i <= size; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return size + 1;
    }
}
