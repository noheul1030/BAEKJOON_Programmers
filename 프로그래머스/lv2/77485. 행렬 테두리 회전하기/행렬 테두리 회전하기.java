import java.io.*;
import java.util.*;

class Solution {
    public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] list = new int[rows][columns];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 1; i <= rows * columns; i++) {
			if (count1 < columns) {
				list[count2][count1] = i;
				count1++;
			} else {
				count1 = 0;
				count2++;

				list[count2][count1] = i;
				count1++;
			}
		}

		int temp1 = 0;
		int temp2 = 0;
		
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		boolean bool = true;
		
		for (int[] numlist : queries) {
			bool = true;
			List<Integer> check = new ArrayList<Integer>();

			int x0 = numlist[0]-1, y0 = numlist[1]-1;
			int x1 = x0, y1 = y0;
			int x2 = numlist[2]-1, y2 = numlist[3]-1, d = 1;

			while (bool == true) {

				int nx = x1 + dx[d];
				int ny = y1 + dy[d];

				if (nx > x2 || ny > y2 || nx < x0 || ny < y0) {
					d = (d + 1) % 4;
					continue;
				} else {
					temp2 = list[x1][y1];
					check.add(temp2);
					list[x1][y1] = temp1;
					temp1 = temp2;
					if (x0 == nx && y0 == ny) {
						list[x0][y0] = temp1;
						Collections.sort(check);
						answer[count3] = check.get(0);
						count3++;
						bool = false;
					}					
				}
				x1 = nx;
				y1 = ny;
			}
		}

		return answer;
	}
}