package high_score_kit.hash.전화번호_목록;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] a = {"119", "97674223", "1195524421"};
        System.out.println(s.solution(a));

        String[] b = {"123","456","789"};
        System.out.println(s.solution(b));

        String[] c = {"12","123","1235","567","88"};
        System.out.println(s.solution(c));
    }
}

class Solution {
    public boolean solution(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}