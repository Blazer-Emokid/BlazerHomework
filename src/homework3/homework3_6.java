package homework3;

import java.util.Scanner;

public class homework3_6 {


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

        System.out.print("\nМассив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Проверка
        boolean increasing = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] >= array[i + 1]) {
                increasing = false;
                break;
            }
        }

        System.out.println("\n");
        if (increasing) {
            System.out.println("Массив возрастает");
        } else {
            System.out.println("Массив НЕ возрастает");
        }

        scanner.close();
    }

}

