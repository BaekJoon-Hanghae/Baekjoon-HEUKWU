package high_score_kit.greedy.체육복;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {2, 4};
        int[] b = {1, 3, 5};
        System.out.println(s.solution(5, a, b));

        int[] c = {2, 4};
        int[] d = {3};
        System.out.println(s.solution(5, c, d));

        int[] e = {3};
        int[] f = {1};
        System.out.println(s.solution(3, e, f));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}