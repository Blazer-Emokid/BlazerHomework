package homework7;

import java.util.Scanner;

public class homework7_1 {

    // Метод для поиска самой короткой строки
    public static String findShortest(String[] strings) {
        String shortest = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
        }
        return shortest;
    }

    // Метод для поиска самой длинной строки
    public static String findLongest(String[] strings) {
        String longest = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для поиска самой короткой и самой длинной строки ===");
        System.out.println("Введите 3 строки:");

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        String shortest = findShortest(strings);
        String longest = findLongest(strings);

        System.out.println("\n=== Результаты ===");
        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина: " + shortest.length() + " симв.)");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина: " + longest.length() + " симв.)");

        scanner.close();
    }
}