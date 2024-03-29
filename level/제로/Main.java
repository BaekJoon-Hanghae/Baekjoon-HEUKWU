package level.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }

        for (Integer i : stack) {
            sum += i;
        }

        System.out.println(sum);
    }
}