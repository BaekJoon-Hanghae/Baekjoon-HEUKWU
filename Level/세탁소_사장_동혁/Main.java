package Level.세탁소_사장_동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int j = 0;
            int[] arr2 = new int[4];

            while (n > 0) {
                arr2[j] = n / arr[j];
                n %= arr[j];
                j++;
            }

            for (int i1 : arr2) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
    }
}
