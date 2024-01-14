class Solution {
    public int solution(int[][] board) {
        int answer = 0;

		int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					int n = 0;
					while (n < dx.length) {
						if (i + dx[n] >= 0 && j + dy[n] >= 0 && i + dx[n] < board.length && j + dy[n] < board.length) {
							board[i + dx[n]][j + dy[n]] = board[i + dx[n]][j + dy[n]] == 0 ? 2
									: board[i + dx[n]][j + dy[n]];
						}
						n++;
					}
				}
			}
		}
	    
		for (int[] arr : board) {
			for (int i : arr) {
				answer += i == 0 ? 1 : 0;
			}
		}
		return answer;
    }
}
