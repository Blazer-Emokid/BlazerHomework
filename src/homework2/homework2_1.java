package homework2;

import java.util.Scanner;

public class homework2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Для отрицательных чисел остаток от деления на 2 может быть -1 или 0
        if (Math.abs(number % 2) == 0) {
            System.out.println("Число " + number + " - четное");
        } else {
            System.out.println("Число " + number + " - нечетное");
        }

        scanner.close();
    }
}
