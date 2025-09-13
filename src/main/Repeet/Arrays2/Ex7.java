package Arrays2;

import java.util.Arrays;

public class Ex7 {
    /**
     * Если максимальный элемент массива больше суммы элементов массива, заменить его нулем, иначе удвоить
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        if (max > sum) {
            arr[maxIndex] = 0;
        } else arr[maxIndex] *= 2;
        System.out.println("sum " + sum);
        System.out.println("max " + max);
        System.out.println(Arrays.toString(arr));
    }
}