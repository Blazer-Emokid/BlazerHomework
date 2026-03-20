package homework1;

import java.util.Scanner;

public class homework1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 10 до 99: ");
        int n = scanner.nextInt();
        if (n >= 10 && n <= 99) {

            int dozens = n / 10;
            int units = n % 10;
            int sum = dozens + units;

            System.out.println("Вы ввели число: " + n);
            System.out.println("Первая цифра (десятки): " + dozens);
            System.out.println("Вторая цифра (единицы): " + units);
            System.out.println("Сумма цифр: " + dozens + " + " + units + " = " + sum);
        } else {
            System.out.println("Ошибка! Введите двузначное число (от 10 до 99).");
        }
        scanner.close();
    }
}