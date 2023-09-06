package high_score_kit.stack_queue.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(s.solution(a)));
        System.out.println(Arrays.toString(s.solution2(a)));

        int[] b = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(s.solution(b)));
        System.out.println(Arrays.toString(s.solution2(b)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.empty() || stack.peek() != i) {
                stack.add(i);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int num = 10;
        for (int i : arr) {
            if (i != num) {
                list.add(i);
                num = i;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}