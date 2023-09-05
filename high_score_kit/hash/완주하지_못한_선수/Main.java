package high_score_kit.hash.완주하지_못한_선수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};
        System.out.println(s.solution2(a, b));

        String[] c = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] d = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(s.solution2(c, d));

        String[] e = {"mislav", "stanko", "mislav", "ana"};
        String[] f = {"stanko", "ana", "mislav"};
        System.out.println(s.solution2(e, f));
    }
}

class Solution {
    //효율성 테스트 실패
    public String solution(String[] participant, String[] completion) {
        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (completion[i].equals(participant[j])) {
                    participant[j] = "";
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String s : participant) {
            if (!s.equals("")) {
                sb.append(s);
            }
        }

        return sb.toString();
    }

    public String solution2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}