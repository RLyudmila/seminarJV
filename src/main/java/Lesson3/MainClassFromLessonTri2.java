package Lesson3;
import java.util.Arrays;
import java.util.List;
public class MainClassFromLessonTri2 {

        public static void main(String[] args) {
            StringBuilder day = new StringBuilder("28");
            StringBuilder month = new StringBuilder("9");
            StringBuilder year = new StringBuilder("1990");
            StringBuilder[] date = { day, month, year };
            List<StringBuilder> d = Arrays.asList(date);
            date[1] = new StringBuilder("09");
            System.out.println(d);
        }
}

