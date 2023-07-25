package level.나이순_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            String[] c = new String[]{a, b};
            arr[i] = c;
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for (String[] s : arr) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
