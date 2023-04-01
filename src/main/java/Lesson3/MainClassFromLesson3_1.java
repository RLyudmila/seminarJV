package Lesson3;

import java.util.*;

public class MainClassFromLesson3_1 {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {

        String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        List<String> planet1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planet1.add(planet[random.nextInt(9)]);
        }
        System.out.println(planet1);
        Collections.sort(planet1);
        System.out.println(planet1);


        int k = 1;

        for (int i = 0; i < planet1.size() - 1; i++) {

            if (planet1.get(i).equals(planet1.get(i + 1))) {
                k++;
            } else {
                System.out.println(planet1.get(i) + k);
                k = 1;
            }

        }
        System.out.println(planet1.get(planet1.size() - 1) + k);
    }

}

