package Arrays;

import java.util.Random;

public class Ex2 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными числами.Сделать так что бы минимальных значений
     * было как минимум 3. Найти последний встречный минимальный элемент.
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        int minIndex = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100, 100);
            System.out.println(arr[i]);
            if (arr[i] < minIndex & index < 3) {
                index++;
            }
            if (index == 3) System.out.println("Last minimal num = " + arr[i]);
        }
    }
}
