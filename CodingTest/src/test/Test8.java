package test;

import java.util.Arrays;

public class Test8 {
	public static void main(String[] args) {
		int[] a = new int[1001];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		a[1000] = 1000;
		Arrays.sort(a);

//		for(int i = 0; i < a.length; i++){
//			System.out.printf("%d)%d\n",i,a[i]);
//		}

		int index = 0;
		for (int i = a.length / 2, j = a.length / 2 + 1; i >= 0; i--) {
			if (a[i] == 88) {
				index = i;
				break;
			}
			if (a[j] == 88) {
				index = j;
				break;
			}

			if (Math.abs(a[i] - 88) < Math.abs(a[j] - 88)) {
				if (Math.abs(a[i] - 88) < Math.abs(a[index] - 88)) {
					index = i;
				}
			} else {
				if (Math.abs(a[j] - 88) < Math.abs(a[index] - 88)) {
					index = j;
				}
			}
			j++;
		}

		int temp = 0;
		int temp2 = 0;
		if (a[index] < 88) {
			index++;
			temp = a[index];
			a[index] = 88888888;
			for (int i = index + 1; i < a.length; i++) {
				temp2 = a[i];
				a[i] = temp;
				temp = temp2;
				
			}
		}
		if (a[index] >= 88) {
			temp = a[index];
			a[index] = 88000000;
			for (int i = index + 1; i < a.length; i++) {
				temp2 = a[i];
				a[i] = temp;
				temp = temp2;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d)%d\n", i, a[i]);
		}
	}

//	// Àç±ÍÀû Å½»ö
//	public static int binarySearch1(int key, int low, int high) {
//		int mid;
//
//		if (low <= high) {
//			mid = (low + high) / 2;
//
//			if (key == arr[mid]) { // Å½»ö ¼º°ø
//				return mid;
//			} else if (key < arr[mid]) {
//				return binarySearch1(key, low, mid - 1); // ¿ÞÂÊ ºÎºÐ Å½»ö
//			} else {
//				return binarySearch1(key, mid + 1, high); // ¿À¸¥ÂÊ ºÎºÐ Å½»ö
//			}
//		}
//
//		return -1; // Å½»ö ½ÇÆÐ
//	}
//
//	// ¹Ýº¹Àû Å½»ö
//	public static int binarySearch2(int key, int low, int high) {
//		int mid;
//
//		while (low <= high) {
//			mid = (low + high) / 2;
//
//			if (key == arr[mid]) {
//				return mid;
//			} else if (key < arr[mid]) {
//				high = mid - 1;
//			} else {
//				low = mid + 1;
//			}
//		}
//
//		return -1; // Å½»ö ½ÇÆÐ
//	}

}
