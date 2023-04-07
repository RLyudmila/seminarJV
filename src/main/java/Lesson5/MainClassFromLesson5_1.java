package Lesson5;
import java.util.*;
public class MainClassFromLesson5_1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        //db.putIfAbsent(key: 1,value:"один");
        //db.put(key:2, value:"два");
        //db.put(key:null, value:"!null");
        db.put(1, "один"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);
    }
}

