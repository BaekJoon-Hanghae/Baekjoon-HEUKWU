package high_score_kit.sorting.가장_큰_수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {6, 10, 2};
        System.out.println(s.solution(a));

        int[] b = {3, 30, 34, 5, 9};
        System.out.println(s.solution(b));
    }
}

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }
}