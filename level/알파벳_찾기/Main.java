package level.알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[a.length()];
        Arrays.fill(arr, -1);

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (a.charAt(i) == s.charAt(j)) {
                    arr[i] = j;
                    break;
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
