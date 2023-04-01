package Lesson3;

import java.util.*;

public class MainClassFromLesson3 {
public static void main(String[]args){
    ex0();
    ex1();
}
private static void ex0() {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e"+"l"+"l"+"o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h','e','l','l','o'});
    System.out.println(s1==s5);
    System.out.println(s1.equals(s5));
}
    private static void ex1() {
        List<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<20; i++){
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        Collections.sort(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
