package test;

import java.util.Arrays;

// 퀵 정렬 예시
public class test4 {

    public static void main(String[] args) {
        int[] A = { 6, 9, 5, 1, 12, 4, 8, 7, 2, 11, 10, 3 };
        // System.out.println(Arrays.toString(A));
        quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public static void quickSort(int[] arr, int start, int end) {
        int part2 = partiton(arr, start, end);
        // System.out.println(Arrays.toString(arr));
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public static int partiton(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        // System.out.println("pivot : " + pivot);
        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start <= end) {
                // System.out.println("start : " + start + " end : " +end + "\tstart 값 :
                // "+arr[start] + " end값 : " + arr[end]);
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
            // System.out.println(Arrays.toString(arr));
        }
        // System.out.println("정렬 한번 끝");
        return start;
    }
}