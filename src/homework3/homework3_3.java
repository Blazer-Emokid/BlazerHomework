package homework3;

import java.util.Scanner;

public class homework3_3 {


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
                array[i] = (int) (Math.random() * 100);
            }
            System.out.println("Массив заполнен случайными числами!");
        }

        // Выводим массив
        System.out.print("\nМассив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Находим индексы минимума и максимума
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\n\nИндекс минимального элемента: " + minIndex + " (значение: " + array[minIndex] + ")");
        System.out.println("Индекс максимального элемента: " + maxIndex + " (значение: " + array[maxIndex] + ")");

        scanner.close();
    }
}
