package ThisIsCodingTest.first.implementation.p323_문자열_압축;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabcdede"));
        System.out.println(solution("abcabcabcabcdededededede"));
        System.out.println(solution("xababcdcdababcdcd"));
    }

    private static int solution(String s) {
        int answer = s.length();
        for (int step = 1; step < s.length() / 2 + 1; step++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, step);
            int cnt = 1;

            for (int j = step; j < s.length(); j += step) {
                StringBuilder sb = new StringBuilder();

                for (int k = j; k < j + step; k++) {
                    if (k < s.length()) {
                        sb.append(s.charAt(k));
                    }
                }

                if (prev.equals(sb.toString())) {
                    cnt += 1;
                } else {
                    compressed.append((cnt >= 2) ? cnt + prev : prev);
                    sb = new StringBuilder();

                    for (int k = j; k < j + step; k++) {
                        if (k < s.length()) {
                            sb.append(s.charAt(k));
                        }
                    }

                    prev = sb.toString();
                    cnt = 1;
                }
            }
            compressed.append((cnt >= 2) ? cnt + prev : prev);
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}