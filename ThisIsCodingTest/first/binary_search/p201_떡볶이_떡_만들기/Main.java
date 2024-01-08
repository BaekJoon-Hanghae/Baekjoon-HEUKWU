package ThisIsCodingTest.first.binary_search.p201_떡볶이_떡_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = (int) 1e9;
        int result = 0;
        while (start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;
            for (int i : a) {
                if (i > mid) {
                    sum += i - mid;
                }
            }

            if (sum < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}

/*
4 6
19 15 10 17
 */
