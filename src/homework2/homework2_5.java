package homework2;

import java.util.Scanner;

public class homework2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        } else {
            System.out.println("Ошибка! Нужно ввести положительное число.");
        }

        scanner.close();
    }
}

