package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        /**
         * Создать массив из случайных чисел, заполнить его случайными значениями. Обменять местами последний встречный
         * максимум и последний минимум.
         */
        int[] arr = new int[10];
        int max = 0;
        int min = 0;
        int temp  = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j > 0) {
                max = j;
            }
            if (j < 0) {
                min = j;
            }
        }
        temp = max;
        max = min;
        min = temp;
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
