package ThisIsCodingTest.implementation.왕실의_나이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
        int count = 0;

        String s = br.readLine();
        int a = s.charAt(0) - 96;
        int b = s.charAt(1) - '0';

        for (int i = 0; i < move.length; i++) {
            int x = a + move[i][0];
            int y = b + move[i][1];
            if (1 <= x && x <= 8 && 1 <= y && y <= 8) {
                count++;
            }
        }

        System.out.println(count);
    }
}
