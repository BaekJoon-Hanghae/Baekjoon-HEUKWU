package 영화감독_숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dev = 666;
        int count = 1;

        while (count != n) {
            dev++;
            if (String.valueOf(dev).contains("666")) {
                count++;
            }
        }

        System.out.println(dev);
    }
}
