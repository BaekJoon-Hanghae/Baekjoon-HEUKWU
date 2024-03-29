package high_score_kit.greedy.조이스틱;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("JAZ"));
        System.out.println(s.solution("JEROEN"));
        System.out.println(s.solution("JAN"));
    }
}

class Solution {
    public int solution(String name) {
        int count = 0;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c < 'N') {
                count += c - 'A';
            } else {
                count += 'Z' - c + 1;
            }

            int a = i + 1;

            while (a < name.length() && name.charAt(a) == 'A') {
                a++;
            }

            move = Math.min(move, i + (name.length() - a) + Math.min(i, name.length() - a));
        }

        return count + move;
    }
}