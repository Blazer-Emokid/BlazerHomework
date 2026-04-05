package homework7;

import java.util.Scanner;

public class homework7_4 {

    // Метод для проверки, состоит ли строка только из различных символов
    public static boolean hasAllUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Программа для поиска слова из различных символов ===");
        System.out.println("Введите 3 строки:");

        // Ввод трех строк
        System.out.print("Строка 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Строка 2: ");
        String str2 = scanner.nextLine();

        System.out.print("Строка 3: ");
        String str3 = scanner.nextLine();

        // Помещаем строки в массив
        String[] strings = {str1, str2, str3};

        // Поиск первого слова, состоящего только из различных символов
        String foundWord = null;
        int wordIndex = -1;

        for (int i = 0; i < strings.length; i++) {
            if (hasAllUniqueChars(strings[i])) {
                foundWord = strings[i];
                wordIndex = i + 1;
                break;
            }
        }

        // Вывод результатов
        System.out.println("\n=== Результат ===");
        if (foundWord != null) {
            System.out.println("Найдено слово, состоящее только из различных символов:");
            System.out.println("Строка " + wordIndex + ": \"" + foundWord + "\"");
        } else {
            System.out.println("Среди введенных строк нет слов, состоящих только из различных символов.");
        }

        scanner.close();
    }
}