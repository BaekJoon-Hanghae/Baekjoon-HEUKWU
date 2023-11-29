package ThisIsCodingTest.first.greedy.p315_볼링공_고르기;

import java.util.Scanner;

public class Main2 {

    private static int n, m;
    private final static int[] arr = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x]++;
        }

        int result = 0;

        for (int i = 1; i <= m; i++) {
            n -= arr[i];
            result += arr[i] * n;
        }

        System.out.println(result);
    }
}

/*
5 3
1 3 2 3 2
 */