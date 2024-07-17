class Solution {
    public int calculate(String s) {

        if (s == "") {
            return 0;
        }

        int m = 0;
        int r = 0;
        Stack<Integer> st = new Stack<>();

        char sign = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                m = m * 10 + (ch - '0');

            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (sign == '+')
                    st.push(m);
                else if (sign == '-')
                    st.push(-m);
                else if (sign == '*')
                    st.push(st.pop() * m);
                else if (sign == '/')
                    st.push(st.pop() / m);

                m = 0;
                sign = ch;
            }
        }

        while (!st.isEmpty()) {
            r = r + st.pop();
        }
        return r;
    }
}