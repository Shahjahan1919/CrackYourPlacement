class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> var = new HashMap<>();
        var.put('(', ')');
        var.put('[', ']');
        var.put('{', '}');

        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {

            if (var.containsKey(ch)) {
                st.push(ch);
            }

            else if (var.containsValue(ch)) {
                if (st.isEmpty() || var.get(st.pop()) != ch) {
                    return false;
                }
            }

        }
        return true;
    }
}