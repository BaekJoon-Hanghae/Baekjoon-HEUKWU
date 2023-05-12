package 바구니_순서_바꾸기;

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

        int[] arr = new int[n + 1];
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            arr2[i] = i;
        }

        for (int a = 0; a < m; a++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(s.nextToken());
            int j = Integer.parseInt(s.nextToken());
            int k = Integer.parseInt(s.nextToken());

            for (int l = i; l <= j - k + i; l++) {
                arr[l] = arr2[l + k - i];
            }

            for (int l = i + j - k + 1; l <= j; l++) {
                arr[l] = arr2[l - j + k - 1];
            }

            arr2 = arr.clone();
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
