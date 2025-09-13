package Arrays2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * Первый отрецательный элемент массива замаенить суммой эллементов, расположенных после максимального
         */
        int[] arr =  new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 60) - 30;
        }
        System.out.println(Arrays.toString(arr));
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            if (i == index) {
                arr[i] = sum;
            }
        }
        System.out.println("sum " + sum);
        System.out.println("index " + index);
        System.out.println(Arrays.toString(arr));
    }
}
