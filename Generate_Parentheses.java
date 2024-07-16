class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> sol = new ArrayList<>();
        func(0, 0, "", n, sol);
        return sol;
    }

    private void func(int o, int c, String s, int n, List<String> sol) {
        if (o == c && o + c == 2 * n) {
            sol.add(s);
            return;
        }

        if (o < n) {
            func(o + 1, c, s + "(", n, sol);
        }

        if (c < o) {
            func(o, c + 1, s + ")", n, sol);
        }
    }

}
