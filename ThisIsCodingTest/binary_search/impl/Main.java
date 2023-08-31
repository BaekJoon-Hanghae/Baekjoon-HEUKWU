package ThisIsCodingTest.binary_search.impl;

import java.util.Scanner;

public class Main {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2; // 중간점
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1); // 중간점 왼쪽 확인
        } else {
            return binarySearch(arr, target, mid + 1, end); // 중간점 오른쪽 확인
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소의 개수(n), 찾고자 하는 값(target)
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
            return;
        }

        System.out.println(result + 1);
    }
}
