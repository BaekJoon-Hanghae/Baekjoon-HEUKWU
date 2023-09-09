package high_score_kit.hash.의상;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[][] a = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        System.out.println(s.solution(a));

        String[][] b = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };
        System.out.println(s.solution(b));
    }
}

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String s = clothe[1];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext()) {
            answer *= it.next() + 1;
        }

        return answer - 1;
    }
}