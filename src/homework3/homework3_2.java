package homework3;

import java.util.Scanner;

public class homework3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("1 - ручной, 2 - случайный");
        if (scanner.nextInt() == 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("[" + i + "]: ");
                arr[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
        }

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("\n\nМинимум: " + min);
        System.out.println("Максимум: " + max);

        scanner.close();
    }
}

