package ThisIsCodingTest.sort.성적이_낮은_순서로_학생_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[100000];

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            arr[score] = name;
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            if (s != null) {
                sb.append(s).append(" ");
            }
        }

        System.out.println(sb);
    }
}
