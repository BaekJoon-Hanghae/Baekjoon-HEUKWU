package high_score_kit.brute_force.소수_찾기;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("17"));

        Solution.set.clear();

        System.out.println(s.solution("011"));
    }
}

class Solution {

    static HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {

        dfs("", numbers);

        int answer = 0;

        for (Integer integer : set) {
            if (prime(integer)) {
                answer++;
            }
        }

        return answer;
    }

    static void dfs(String str, String tmp) {
        if (!str.equals("")) {
            set.add(Integer.parseInt(str));
        }

        for (int i = 0; i < tmp.length(); i++) {
            dfs(str + tmp.charAt(i), tmp.substring(0, i) + tmp.substring(i + 1));
        }
    }

    static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}