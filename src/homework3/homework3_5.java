package homework3;

import java.util.Scanner;

public class homework3_5 {


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

        // Выводим исходный массив
        System.out.print("\nИсходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Меняем местами элементы
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Выводим измененный массив
        System.out.print("\n\nМассив после замены: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        scanner.close();
    }
}


