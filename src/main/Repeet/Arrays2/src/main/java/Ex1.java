import java.util.Arrays;

public class Ex1 {
    /**
     * Увелчить в 2 раза элемент, расположенный непосредсвенно после первого встречного максимального элемента
     * массива.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20) - 10;
        }
        int max = arr[0];
        int index = 0;
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
                index += 1;
            }
            if (i == index) {
                sum = arr[i] * 2;
            }
        }
        System.out.println(index);
        System.out.println(sum);
    }
}
