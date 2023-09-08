package high_score_kit.sorting.H_Index;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {3, 0, 6, 1, 5};
        System.out.println(s.solution(a));

        System.out.println(s.solution2(a));
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public int solution2(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            answer = Math.max(answer, Math.min(citations[i], citations.length - i));
        }

        return answer;
    }
}