package ThisIsCodingTest.first.greedy.p311_모험가_길드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int result = 0;
        int count = 0;

        for (int i : a) {
            count++;

            if (count >= i) {
                result++;
                count = 0;
            }
        }

        System.out.println(result);
    }
}

/*
5
2 3 1 2 2
 */