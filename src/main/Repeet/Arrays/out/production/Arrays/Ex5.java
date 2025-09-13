package Arrays.out.production.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        /**Скопировать в новый массив только отрецательные числа из текущего одномерного массива
         * *
         */
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arrMin = new int[10];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= tmp; j++) {
                if (arr[i] < 0) {
                    arrMin[tmp] = arr[i];
                    tmp++;
                    break;
                }
            }
        }
        System.out.println("////////////////////////////////////");
        for (int b : arrMin) {
            System.out.println(b);
        }
    }
}
