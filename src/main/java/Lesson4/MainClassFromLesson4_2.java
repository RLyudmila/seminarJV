package Lesson4;
import java.util.*;
public class MainClassFromLesson4_2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
        pr.add(123);
        pr.add(2);
        pr.add(12);
        pr.add(3);
        System.out.println(pr);
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
    }
}
