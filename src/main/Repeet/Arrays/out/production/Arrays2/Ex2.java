package Arrays.out.production.Arrays2;

import java.util.Arrays;

public class Ex2 {
    /**
     * В одномерном массиве все элементы, расположенные после максимального, заменить средним значением элементов массива.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 60) - 30;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("index " + indexMax);
        System.out.println("max value " + max);
        int sumNum = 0;
        for (int i = 0; i < arr.length; i++) {
            sumNum += arr[i] / 10;
        }
        System.out.println("average number " + sumNum);
        for (int i = indexMax + 1; i < arr.length; i++) {
            arr[i] = sumNum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
