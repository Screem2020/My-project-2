package Arrays.out.production.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        /**
         *  Создать массив случайных чисел, заполнить его случайными числами. Сделать так что бы было несколько минимумов
         *  и максисмумов. Обменять местами первый встерчный максимальный и последний минимальные эелементы.
         */
        int[] arr = new int[10];
        int min = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        temp = max;
        max = min;
        min = temp;
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
