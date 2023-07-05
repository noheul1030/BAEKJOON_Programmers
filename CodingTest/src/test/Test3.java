package test;

public class Test3 {

	public static void main(String[] args) {
		int[] array = { 7, 3, 2, 8, 9, 4, 6, 1, 5 };
		pick(array);
		//bubble(array);
	}

	// 선택 정렬(selection sort)
	public static void pick(int[] array) {
		int temp = 0;
		int min = 0;
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			min = array[i];
			for (int j = array.length - 1; j > i; j--) {
				if (min >= array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			if (temp > min) {
				array[i] = min;
				array[minIndex] = temp;
			}
		}
	}

	// 버블 정렬(bubble sort)
	public static void bubble(int[] array) {
		int temp1 = 0;
		
		for(int a : array) {			
			for (int i = 0; i < array.length - 1; i++) {
				temp1 = array[i];
				if (temp1 > array[i + 1]) {
					array[i] = array[i + 1];
					array[i + 1] = temp1;
				}
			}
		}
	}
	
	public static void quick(int[] array) {
		
		
	}
}
