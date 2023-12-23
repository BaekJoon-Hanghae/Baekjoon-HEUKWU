package programmers._3진법_뒤집기;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
    }
}

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        sb.reverse();

        return Integer.parseInt(sb.toString(), 3);
    }
}
