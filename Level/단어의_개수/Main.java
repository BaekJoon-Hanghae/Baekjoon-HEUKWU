package Level.단어의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int count = 0;
        for (String s : split) {
            if (!s.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
