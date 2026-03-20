package homework3;

import java.util.Scanner;

public class homework3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("1 - ручной ввод, 2 - случайные");
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

        System.out.print("\nПрямой: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        System.out.print("\nОбратный: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");

        scanner.close();
    }
}
