package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test6 {
	public static void main(String[] args) {
		int[] A_Class = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
		int[] B_Class = { 111, 112, 113, 114, 115, 116, 117, 118, 119, 120 };

		String[] A_name = { "È«±æÀÏ", "È«±æÀÌ", "È«±æ»ï", "È«±æ»ç", "È«±æ¿À", "È«±æÀ°", "È«±æÄ¥", "È«±æÆÈ", "È«±æ±¸", "È«±æ½Ê", };
		String[] B_name = { "È«µ¿ÀÏ", "È«µ¿ÀÌ", "È«µ¿»ï", "È«µ¿»ç", "È«µ¿¿À", "È«µ¿À°", "È«µ¿Ä¥", "È«µ¿ÆÈ", "È«µ¿±¸", "È«µ¿½Ê", };

		int[] A_kor = { 67, 55, 77, 33, 46, 35, 77, 34, 99, 100 };
		int[] B_kor = { 11, 77, 22, 23, 66, 100, 100, 23, 44, 22 };

		int[] A_eng = { 11, 77, 66, 77, 34, 99, 100, 23, 44, 22 };
		int[] B_eng = { 44, 33, 99, 100, 23, 44, 22, 23, 66, 100 };

		int[] A_mat = { 44, 33, 99, 100, 23, 44, 22, 23, 66, 100 };
		int[] B_mat = { 44, 33, 22, 23, 66, 100, 22, 23, 66, 100 };

		int[] A_sum = new int[A_Class.length];
		int[] B_sum = new int[B_Class.length];
		
		for (int i = 0; i < A_Class.length; i++) {
			A_sum[i] = A_kor[i] + A_eng[i] + A_mat[i];
			B_sum[i] = B_kor[i] + B_eng[i] + B_mat[i];
		}
		System.out.println("A_sum : "+ Arrays.stream(A_sum).boxed().collect(Collectors.toList()));
		System.out.println("B_sum : "+Arrays.stream(B_sum).boxed().collect(Collectors.toList()));
		System.out.println();

		int A_check = -1;
		int B_check = -1;

		// A¹Ý ÃÑÁ¡ ¼øÀ§
		while (A_check != 0) {
			int cnt = 0;

			int tempClass = 0;
			String tempName = "";
			int tempSum = 0;

			for (int i = 0, j = 1; i < A_Class.length - 1; i++) {
				if (A_sum[i] < A_sum[j]) {
					cnt++;

					tempClass = A_Class[j];
					A_Class[j] = A_Class[i];
					A_Class[i] = tempClass;

					tempName = A_name[j];
					A_name[j] = A_name[i];
					A_name[i] = tempName;

					tempSum = A_sum[j];
					A_sum[j] = A_sum[i];
					A_sum[i] = tempSum;
				}
				j++;
			}
			A_check = cnt;
		}
		System.out.println("< ¹öºí sort >");
		System.out.println();
		System.out.println("A¹Ý ÃÑÁ¡ ¼øÀ§\n");
		System.out.println("ÇÐ¹ø / ÀÌ¸§ / ÃÑÁ¡ \n");
		for (int i = 0; i < A_sum.length; i++) {
			System.out.println(A_Class[i] + " / " + A_name[i] + " / " + A_sum[i]);
		}

		// B¹Ý ÃÑÁ¡ ¼øÀ§
		while (B_check != 0) {
			int cnt = 0;

			for (int i = 0, j = 1; i < B_Class.length - 1; i++) {
				int tempClass = 0;
				String tempName = "";
				int tempSum = 0;

				if (B_sum[i] < B_sum[j]) {
					cnt++;

					tempClass = B_Class[j];
					B_Class[j] = B_Class[i];
					B_Class[i] = tempClass;

					tempName = B_name[j];
					B_name[j] = B_name[i];
					B_name[i] = tempName;

					tempSum = B_sum[j];
					B_sum[j] = B_sum[i];
					B_sum[i] = tempSum;
				}
				j++;
			}
			B_check = cnt;
		}
		System.out.println();
		System.out.println("B¹Ý ÃÑÁ¡ ¼øÀ§\n");
		System.out.println("ÇÐ¹ø / ÀÌ¸§ / ÃÑÁ¡ \n");
		for (int i = 0; i < B_sum.length; i++) {
			System.out.println(B_Class[i] + " / " + B_name[i] + " / " + B_sum[i]);
		}
	}
}
