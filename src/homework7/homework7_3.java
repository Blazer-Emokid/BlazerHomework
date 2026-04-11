package homework7;

import java.util.Scanner;

public class homework7_3 {

    // Метод для вычисления средней длины строк
    public static double calculateAverageLength(String[] strings) {
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.length;
    }

    // Метод для поиска и вывода строк короче средней
    public static void findShorterThanAverage(String[] strings, double averageLength) {
        boolean found = false;
        System.out.println("\n=== Строки, длина которых меньше средней ===");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < averageLength) {
                System.out.println("Строка " + (i + 1) + ": \"" + strings[i] +
                        "\" (длина: " + strings[i].length() + " симв.)");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Строк, длина которых меньше средней, не найдено.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для поиска строк короче среднего ===");
        System.out.println("Введите 3 строки:");

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Вычисляем среднюю длину
        double averageLength = calculateAverageLength(strings);

        // Выводим информацию
        System.out.println("\nСредняя длина всех строк: " +
                String.format("%.2f", averageLength) + " символов");

        // Находим и выводим строки короче средней
        findShorterThanAverage(strings, averageLength);

        scanner.close();
    }
}