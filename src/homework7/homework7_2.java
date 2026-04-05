package homework7;

import java.util.Scanner;

public class homework7_2 {

    // Метод для сортировки строк по длине
    public static void sortByLength(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Метод для вывода строк
    public static void printStrings(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  " + (i + 1) + ". \"" + arr[i] + "\" -> " + arr[i].length() + " символов");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для упорядочивания строк по длине ===");
        System.out.println("Введите 3 строки:");

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        System.out.println("\nИсходные строки:");
        printStrings(strings);

        // Сортируем строки
        sortByLength(strings);

        System.out.println("\nРезультат сортировки (по возрастанию длины):");
        printStrings(strings);

        scanner.close();
    }
}