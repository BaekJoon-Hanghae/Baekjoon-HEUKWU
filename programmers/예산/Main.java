package programmers.예산;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(s.solution(new int[]{2, 2, 3, 3}, 10));
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++, count++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
        }

        return count;
    }
}
