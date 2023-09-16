package high_score_kit.brute_force.카펫;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow;
        for (int i = 3; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                int width = area / i;
                int length = i;
                if ((width - 2) * (length - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = length;
                    break;
                }
            }
        }

        return answer;
    }
}