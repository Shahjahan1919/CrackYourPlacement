class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            int res = haystack.indexOf(needle);
            return res;
        }
        return -1;

    }
}