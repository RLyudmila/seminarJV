package taskLesson1;
import java.util.Arrays;
public class MainClassFromTaskTow{
    public static void transArr(int [] arr, int k)
    {
        int i_f,i_t;
        i_t=0;
        for (i_f=0; i_f<arr.length; i_f++)
            if (arr[i_f] !=k ) arr[i_t++]=arr[i_f];
        for (i_f=i_t; i_f<arr.length; i_f++) arr[i_f]=k;
    }

    public static void main(String[] args) {
        int[] b = {1,2,3,4,3,6,3,8};
        for (int x: b) System.out.print(x+" ");
        System.out.println();
        transArr(b,3);
        for (int x: b) System.out.print(x+" ");
        System.out.println();
    }



}