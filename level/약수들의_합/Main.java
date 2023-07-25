package level.약수들의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(br.readLine());
            if (a == -1) {
                break;
            }

            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (sum != a) {
                System.out.println(a + " is NOT perfect.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(a).append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        sb.append(list.get(i));
                    } else {
                        sb.append(" + ").append(list.get(i));
                    }
                }

                System.out.println(sb);
            }
            sum = 0;
        }
    }
}
