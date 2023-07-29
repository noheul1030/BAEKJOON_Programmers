class Solution {
        public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        Ret(answer, 0, 0, n, 0, 1);
        
        return answer;
    }

    public static void Ret(int[][] arr, int x, int y, int n,int dd, int cnt) {

        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };

        arr[x][y] = cnt;

        int d = dd;
        int nx = x + dx[d];
        int ny = y + dy[d];
        
        while (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0) {
            d = (d + 1) % 4;
            nx = x + dx[d];
            ny = y + dy[d];

            if (cnt >= n * n)
                return;
        }

        Ret(arr, nx, ny, n, d, cnt + 1);
    }
}