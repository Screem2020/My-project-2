package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * Создать массив из случайных чисел, заполнить его случайными значениями. Сделать так что бы минимальных значений
         * было как минимум 3. Найти второй по счету минимальный эелемнет.
         */

        int[] arr = new int[10];
        int min = 0;
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100,100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (index <= 3) {
                min = arr[i];
                System.out.println("min numbers " + min);
                if (index == 2) {
                    System.out.println("min num index 2 = " + arr[i]);
                }
                index++;
            }
        }
    }
}
