
package ThisIsCodingTest.implementation.상하좌우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = 1;
        int y = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            switch (s) {
                case "L":
                    if (y - 1 >= 1) {
                        y--;
                    }
                    break;
                case "R":
                    if (y + 1 <= n) {
                        y++;
                    }
                    break;
                case "U":
                    if (x - 1 >= 1) {
                        x--;
                    }
                    break;
                case "D":
                    if (x + 1 <= n) {
                        x++;
                    }
                    break;
            }
        }

        System.out.println(x + " " + y);
    }
}
