package Arrays;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        /**
         * Задан одномерный массив. Сформировать другой одномерный массив из отрицателльных чисел, расположенных
         * между первым встречным максимальным и первым встречным минимальным эелементами исходного массива
         */
//        int[] arr = {-10, 2, -50, -22, 44, 26, -1, 80, -6};
        int[] arr = new int[10];
        int[] arrMin = new int[10];
        int indexMax = 0;
        int indexMin = 0;
        int index = 0;
        int min = arrMin[0];
        int max = arrMin[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Random().nextInt(-100, 100);
//        }
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrMin[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i] >= max && arrMin[i] < 0) {
                max = arrMin[i];
                indexMax = i;
            }
            if (arrMin[i] <= min && arrMin[i] < 0) {
                min = arrMin[i];
                indexMin = i;
            }
        }
        System.out.println(Arrays.toString(arrMin));
        if (indexMax > indexMin) {
            for (int i = indexMin; i <= indexMax; i++) {
                System.out.println(arrMin[i]);
            }
        } else for (int i = indexMax; i <= indexMin; i++) {
            System.out.println(arrMin[i]);
        }
        System.out.println("max " + indexMax);
        System.out.println("min " + indexMin);
    }
}
