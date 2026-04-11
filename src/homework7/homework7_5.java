package homework7;

import java.util.Scanner;

public class homework7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для дублирования букв в строке ===");
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Создаем новую строку с дублированными символами
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar).append(currentChar);
        }

        // Вывод результатов
        System.out.println("\n=== Результат ===");
        System.out.println("Исходная строка: " + input);
        System.out.println("Результат: " + result.toString());

        scanner.close();
    }
}