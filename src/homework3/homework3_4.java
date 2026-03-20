package homework3;

import java.util.Scanner;

public class homework3_4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Выберите способ заполнения:");
        System.out.println("1 - вручную");
        System.out.println("2 - случайными числами");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите элементы:");
            for (int i = 0; i < size; i++) {
                System.out.print("[" + i + "] = ");
                array[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 10) - 2; // числа от -2 до 7, включая нули
            }
            System.out.println("Массив заполнен случайными числами!");
        }

        // Выводим массив
        System.out.print("\nМассив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Подсчитываем количество нулевых элементов
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }

        // Выводим результат
        System.out.println("\n");
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);

            // Дополнительно выводим индексы нулевых элементов
            System.out.print("Индексы нулевых элементов: ");
            for (int i = 0; i < size; i++) {
                if (array[i] == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Нулевых элементов нет");
        }

        scanner.close();
    }
}
