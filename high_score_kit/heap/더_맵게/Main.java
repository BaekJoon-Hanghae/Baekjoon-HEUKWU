package high_score_kit.heap.더_맵게;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {1, 2, 3, 9, 10, 12};
        System.out.println(s.solution(a, 7));
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int j : scoville) {
            q.add(j);
        }
        while(q.peek() < K) {
            if (q.size() == 1)
                return -1;
            q.add(q.poll() + q.poll() * 2);
            answer++;
        }
        return answer;
    }
}