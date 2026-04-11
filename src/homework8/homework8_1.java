package homework8;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class homework8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для удаления повторяющихся элементов ===");
        System.out.print("Введите набор чисел через запятую (например: 1, 2, 3, 4, 4, 5): ");
        String input = scanner.nextLine();

        // Разбиваем строку по запятой, точке с запятой, пробелу или их комбинациям
        String[] elements = input.split("[,\\s;]+");

        // Фильтруем пустые строки
        Set<String> uniqueSet = new LinkedHashSet<>();
        for (String element : elements) {
            if (!element.isEmpty()) {
                uniqueSet.add(element.trim());
            }
        }

        // Вывод результатов
        System.out.println("\n=== Результат ===");
        System.out.println("Исходная строка: " + input);
        System.out.print("Результат: ");

        int index = 0;
        for (String item : uniqueSet) {
            System.out.print(item);
            if (index < uniqueSet.size() - 1) {
                System.out.print(", ");
            }
            index++;
        }
        System.out.println();

        System.out.println("Количество уникальных элементов: " + uniqueSet.size());

        scanner.close();
    }
}