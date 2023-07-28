package test;

public class Test5 {

    public static void main(String[] args) {

        int[] A = { 6, 9, 5, 1, 12, 4, 8, 7, 2, 11, 10, 3 };

        // System.out.println(solution(A));

        int[] arr = { 1, 2, 3, 100, 99, 98 };
        solution(4);
    }
//    public static double solution(int[] numbers) {
//    	// 배열값들의 평균 구하고 null일 경우 0 반환
//    	return Arrays.stream(numbers).average().orElse(0);
//    }    

//    public static int solution(int[] arr) {
//        int answer = Retry(arr, 0);
//
//        return answer;
//    }
//
//    public static int Retry(int[] arr, int cnt) {
//        int[] arr2 = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                if (arr[i] >= 50)
//                    arr2[i] = arr[i] / 2;
//            } else {
//                if (arr[i] < 50)
//                    arr2[i] = arr[i] * 2 + 1;
//            }
//        }
//
//        if (!Arrays.equals(arr, arr2)) {
//            cnt++;
//            return Retry(arr2, cnt);
//        } else
//            return cnt - 1;
//    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        Ret(answer, 0, 0, n, 1);
        for (int[] i : answer) {
            for (int j : i) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        return answer;
    }

    public static void Ret(int[][] arr, int x, int y, int n, int cnt) {

        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };

        arr[x][y] = cnt;

        int d = 0;
        int nx = x + dx[d];
        int ny = y + dy[d];
        System.out.println("x : " + nx + ", y : " + ny + ", cnt : " + cnt);
        while (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0) {
            d = (d + 1) % 4;
            nx = x + dx[d];
            ny = y + dy[d];

            System.out.println("d : " + d);
            if (cnt >= n * n)
                return;
        }

        Ret(arr, nx, ny, n, cnt + 1);
    }
}
