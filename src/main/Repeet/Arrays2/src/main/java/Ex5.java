import java.util.Arrays;

public class Ex5 {
    /**
     * Определить индексы элементов массива, меньших среднего. Результат получить в виде массива
     */
    public static void main(String[] args) {
        int average = 0;
        int size = 10;
        int index = 0;
        int[] newArr = new int[size];
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*60) - 30;
            average += arr[i] / size;
        }
        for (int i = 0; i < arr.length; i++) {
            if (average < arr[i]) {
                newArr[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(average);
        System.out.println(Arrays.toString(newArr));
    }
}
