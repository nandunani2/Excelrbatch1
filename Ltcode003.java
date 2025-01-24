public class Ltcode003 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.myAtoi("42"));           
        System.out.println(solution.myAtoi("   -042"));       
        System.out.println(solution.myAtoi("1337c0d3"));     
        System.out.println(solution.myAtoi("0-1"));           
        System.out.println(solution.myAtoi("words and 987")); 
    }
}

class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}