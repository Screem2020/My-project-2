package Arrays.out.production.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        /**
         * В одномерном массиве найти сумму элементов, расположенных до первого встречного максимального эелмента
         * массива
         */
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j < 0) {
                sum += j;
            } else break;
        }
        System.out.println("sum " + sum);
    }
}
