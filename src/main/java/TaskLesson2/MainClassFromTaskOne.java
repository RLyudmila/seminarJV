package TaskLesson2;
import java.util.Scanner;
public class MainClassFromTaskOne {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String string = in.next();
            System.out.println(isPalindrom(string));
            in.close();
        }

        public static boolean isPalindrom(String string) {
            return string.equals((new StringBuilder(string)).reverse().toString());
        }

    }

