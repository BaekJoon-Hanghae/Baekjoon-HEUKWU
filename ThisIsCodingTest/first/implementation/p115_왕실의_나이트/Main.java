package ThisIsCodingTest.first.implementation.p115_왕실의_나이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private final static int[] dx = {-1, 1, -2, 2, -2, 2, -1, 1};
    private final static int[] dy = {2, 2, 1, 1, -1, -1, -2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = s.charAt(0) - 97;
        int y = s.charAt(1) - 49;

        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < 8 && 0 <= ny && ny < 8) {
                count++;
            }
        }

        System.out.println(count);
    }
}
