package Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.Time;
import java.util.Arrays;
import java.util.Timer;

public class Ex8 {
    public static void main(String[] args) {
        /**
         * Задан одномерный массив. Сформировать другой одномерный массив из отрицателльных чисел, расположенных
         * между первым встречным максимальным и первым встречным минимальным эелементами исходного массива
         */
        int[] arr = {-10, 2, -50, -22, 44, 26, -1, 80, -6};
        int max = arr[0];
        int indexMax = 0;
        int min = arr[0];
        int indexMin = 0;
        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Random().nextInt(-100, 100);
//        }
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
        int[] arrMin = new int[8];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] > min && arr[i] < 0) {
                min = arr[i];
                indexMin = i;
            }

            if (arr[i] >= max & arr[i] < 0) {
                arrMin[index] = arr[i];
                index++;
            }
        }
//        for (int i = 0; i < arrMin.length; i++) {
//            if (arrMin[i] > min && arrMin[i] < 0) {
//                min = arrMin[i];
//                indexMin = i;
//                System.out.println(min);
//            }
//        }
        for (int i = indexMax; i > indexMin; i++) {
            System.out.println(arrMin[index++] = arr[i]);
        }
        System.out.println(Arrays.toString(arrMin));
        System.out.println("max " + indexMax);
        System.out.println("min " + indexMin);

    }
}
