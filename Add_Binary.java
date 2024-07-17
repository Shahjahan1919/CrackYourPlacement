class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int sum = 0;
        // for given test case input values at each state

        int i = a.length() - 1;// 1
        int j = b.length() - 1;// 0

        while (i >= 0 || j >= 0 || carry == 1) {// 2nd iteration i>=0 true,3rd carry==1 true,END
            sum = carry;// 0 , 2nd time carry is 1 so sum is 1,1
            if (i >= 0)
                sum += a.charAt(i) - '0';// 1,2nd iteration 1+1=2,3rd - nope
            if (j >= 0)
                sum += b.charAt(j) - '0';// 2,2nd time doesnt enter this loop since j==-1,no

            sb.append((char) (sum % 2 + '0'));// 0,2nd - 0,(00),1--- (001)
            carry = sum / 2;// 1,2nd- carry=1,3rd time carry=0
            i--;// 0,2nd i=-1
            j--;// -1,-2
        }
        return sb.reverse().toString();// 001 - reverse = 100

    }
}