package ThisIsCodingTest.sort.두_배열의_원소_교체.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr1 = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] arr2 = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (arr1[i] < arr2[i]) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            } else {
                break;
            }
        }

        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }

        System.out.println(sum);
    }
}
