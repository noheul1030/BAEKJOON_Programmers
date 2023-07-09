package test;

public class Test3 {

    public static void main(String[] args) {
        String[][] array = { { "���", "10000" }, { "����", "5467" }, { "��", "5688" }, { "����", "10020" }, { "����", "1203" },
                { "�ٳ���", "2345" } };
        // pick(array);
        bubble(array);

        for (String[] a : array) {
            for (String aa : a) {
                System.out.print(aa + " ");
            }
            System.out.println();
        }
    }

    // ���� ����(selection sort)
    public static void pick(String[][] array) {
        int temp = 0;
        int min = 0;
        int minIndex = 0;
        String[] fruit = new String[2];

        for (int i = 0; i < array.length; i++) {
            fruit = array[i];
            temp = Integer.parseInt(array[i][1]);
            min = Integer.parseInt(array[i][1]);
            for (int j = i + 1; j < array.length; j++) {
                if (min > Integer.parseInt(array[j][1])) {
                    min = Integer.parseInt(array[j][1]);
                    minIndex = j;
                }
            }
            if (temp > min) {
                array[i] = array[minIndex];
                array[minIndex] = fruit;
            }
        }
    }

    // ���� ����(bubble sort)
    public static void bubble(String[][] array) {
        int temp1 = 0;
        String[] fruit = new String[2];

        for (String[] a : array) {
            for (int i = 0; i < array.length - 1; i++) {
                fruit = array[i];
                temp1 = Integer.parseInt(array[i][1]);
                if (temp1 > Integer.parseInt(array[i + 1][1])) {
                    array[i] = array[i + 1];
                    array[i + 1] = fruit;
                }
            }
        }
    }
}
