package high_score_kit.hash.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3};
        int[] b = {3, 3, 3, 2, 2, 4};
        int[] c = {3, 3, 3, 2, 2, 2, 2};

        Solution s = new Solution();

        System.out.println(s.solution(a));
        System.out.println(s.solution(b));
        System.out.println(s.solution(c));
    }
}

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(nums.length / 2, set.size());
    }
}