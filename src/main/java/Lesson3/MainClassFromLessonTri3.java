package Lesson3;
import java.util.ArrayList;
import java.util.List;
public class MainClassFromLessonTri3 {


        public static void main(String[] args) {
            Character value = null;
            List<Character> list1 = new ArrayList<Character>();
            list1.add('S');
            list1.add('e');
            list1.add('r');

                   // List.of('S', 'e', 'r', 'g', 'e', 'y');
            System.out.println(list1);
            list1.remove(1);
            System.out.println(list1);
            // java.lang.UnsupportedOperationException
            List<Character> list2 = List.copyOf(list1);
             // not null, immutable
        }
    }

