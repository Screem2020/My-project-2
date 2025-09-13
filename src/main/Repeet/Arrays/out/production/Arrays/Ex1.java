package Arrays.out.production.Arrays;

import java.util.Random;

public class Ex1 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными значениями. Обменять местами первый встречный
     * максимальный и преывый встерчиый мнимальный эелементы.
     */
    public static void main(String[] args) {
        int numMax = 0;
        int numMin = 0;
        int temp = 0;
        int[] arr = new int[5];
        System.out.println("////////////////////////////");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
            System.out.println(arr[i]);
            if (arr[i] > numMax) {
                numMax = arr[i];
            } else if (arr[i] < numMin) {
                numMin = arr[i];
            }
        }
        System.out.println("///////////////////////////");
        System.out.println("Array is full random the number");
        System.out.println("Max and min number");
        System.out.println(numMax);
        System.out.println(numMin);
        System.out.println("//////////////////////////////");
        temp = numMax;
        numMax = numMin;
        numMin = temp;
        System.out.println("swap numMax and NumMin");
        System.out.println("NumMax " + " = " + numMax);
        System.out.println("NumMin " + " = " + numMin);
    }
}
