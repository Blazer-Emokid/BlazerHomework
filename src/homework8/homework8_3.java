package homework8;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework8_3 {
    public static @NotNull Map<String, Boolean> wordMultiple(String @NotNull [] strings) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        Map<String, Boolean> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для определения повторяющихся строк ===");
        System.out.println("Введите строки через пробел (например: a b a c b): ");
        String input = scanner.nextLine();

        String[] strings = input.split("\\s+");
        Map<String, Boolean> result = wordMultiple(strings);

        System.out.println("\n=== Результат ===");
        System.out.println("Входной массив: " + java.util.Arrays.toString(strings));
        System.out.println("Результат: " + result);

        System.out.println("\n=== Детальный анализ ===");
        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
            String status = entry.getValue() ? "встречается 2 и более раз" : "встречается менее 2 раз";
            System.out.println("\"" + entry.getKey() + "\" -> " + status);
        }

        scanner.close();
    }
}
