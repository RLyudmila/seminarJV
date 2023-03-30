package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        //inputNameAndPrint();
        size2();


    }


    private static void inputNameAndPrint() {
        Scanner scanner = new Scanner(System.in);  // ввод переменных
        String name = scanner.nextLine();
        System.out.printf("Привет, %s", name); //форматированный вывод
        scanner.close();
    }

    private static void size2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1,0,1};
        int k = 0;
        int kmax = 0;
        for (int num : arr) {

            if (num == 1) {
                k++;
                if (k > kmax) {
                    kmax = k;
                }
            } else {
                k = 0;
            }
        }
        System.out.printf("Большая последовательность %s", kmax);
    }

    //private static void size3(int size){

           // int[] arr = new int[size];
       // Random random = new Random();

   // }
}
