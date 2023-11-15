package de.neuefische;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Coconut", "Mango");

        for (String a: fruits) {
            if (a.startsWith("A")){
                System.out.println(a);
            }
        }

        // public int transformStringIntoInt(String currywurst){
        // return currywurst.length }
        List<Integer> newFruit =
                fruits.stream()
                .map(currywurst -> currywurst.length())
                .filter(x -> x>5)
                .collect(Collectors.toList());

        List<Integer> calc = List.of(1, 2, 3, 4, 5, 6);

        int sum =
                calc.stream()
                                .reduce(0, (x, y) -> x+y);

        /**
         * Reduce, how does it work?
         * Start List.of(1, 2, 3, 4, 5, 6)
         * 1.iteration -> 1 + 2 = 3
         * List.of(3, 3, 4, 5, 6)
         * 2.iteration -> 3 + 3 = 6
         * List.of(6, 4, 5, 6)
         * 3.iteration -> 6 + 4 = 10
         * List.of(10, 5, 6)
         * 4.iteration -> 10 + 5 = 15
         * List.of(15, 6)
         * 5.iteration -> 15 + 6 = 21
         * List.of(21)
         * 6.iteration -> 21 + ? => beende reduce und returne!
         * RETURN 21
         */
        System.out.println(fruits);
        System.out.println(newFruit);
        System.out.println(sum);

        List<String> oldEmails = List.of("test1@test.de", "test2@test.de", "test3@test.de", "test2@ttt.org");
        List<String> updatedEmails =
                oldEmails.stream()
                        .map(email -> {
                            if (email.contains("@test.de")) {
                               return email.replace("@test.de", "@tesa.de");
                            } else if (email.contains("@ttt.org")) {
                                return email.replace("@ttt.org", "@tesa.de");
                            }

                            return null;
                        })
                        .toList();
        System.out.println(updatedEmails);
    }
}