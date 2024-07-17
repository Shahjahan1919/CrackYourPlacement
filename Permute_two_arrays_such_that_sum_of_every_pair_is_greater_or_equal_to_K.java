public static boolean isPossible(Integer a[], int b[], int n, int k) {

    // sort a array in reverse order
    Arrays.sort(a, Collections.reverseOrder());

    // sort 2nd array in increasing order

    Arrays.sort(b);

    for (int i = 0; i < n; i++) {
        if (a[i] + b[i] < k) {
            return false;
        }
    }

    return true;
}