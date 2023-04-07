package Lesson5;
import java.util.*;
public class MainClassForLesson5_3 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(9);
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}
