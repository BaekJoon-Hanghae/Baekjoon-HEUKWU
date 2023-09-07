package high_score_kit.brute_force.최소직사각형;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(s.solution(a));

        int[][] b = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(s.solution(b));

        int[][] c = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(s.solution(c));
    }
}

class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int[] i : sizes) {
            x = Math.max(x, Math.max(i[0], i[1]));
            y = Math.max(y, Math.min(i[0], i[1]));
        }

        return x * y;
    }
}