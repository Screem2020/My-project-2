package Arrays.out.production.Arrays2;

import java.util.Arrays;

public class Ex4 {
    /**
     * Поменять местами максимальный и первый отрецательный элементы массива
     */
    public static void main(String[] args) {
        int max = 0;
        int index = 0;
        int indexMax = 0;
        int temp = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        temp = arr[index];
        arr[index] = arr[indexMax];
        arr[indexMax] = temp;
        System.out.println("max index " + indexMax);
        System.out.println("index min " + index);
        System.out.println(Arrays.toString(arr));
    }
}
