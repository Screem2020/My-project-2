package Arrays2;

import java.util.Arrays;

public class Ex6 {
    /**
     * Создать массив из случаных чисел, заполнить его случайными значениями. Обмнять местами последний встречный
     * максимум и последний минимум
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int indexMax = 0;
        int indexMin = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 60) - 30;
            Arrays.sort(arr);
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] >= min && arr[i] < 0) {
                min = arr[i];
                indexMin = i;
            }
        }

        temp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = temp;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println(Arrays.toString(arr));
    }
}
