package taskLesson1;

import java.util.Arrays;

public class MainClassFromTaskOne {
    public static void main(String[] args) {
        int[] arr5 = {50, 7, 76, 92, 22, 72, 31, 67, 70, 20};
        System.out.println("Задан массив: " + Arrays.toString(arr5));
        System.out.printf("Наибольшее значение: %d. Наименьшее значение: %d.\n\n", findMax(arr5), findMin(arr5));

        }
    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    }
