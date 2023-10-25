package high_score_kit.greedy.큰_수_만들기;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("1924", 2));
        System.out.println(s.solution("1231234", 3));
        System.out.println(s.solution("4177252841", 4));
    }
}

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int length = number.length() - k;
        int start = 0;

        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = start; j < k + sb.length() + 1; j++) {
                int a = number.charAt(j) - '0';
                if (max < a) {
                    max = a;
                    start = j + 1;
                }
            }

            sb.append(max);
        }

        return sb.toString();
    }
}