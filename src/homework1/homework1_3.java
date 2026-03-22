package homework1;

import java.util.Scanner;

public class homework1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое трёхзначное число от 100 до 999: ");
        int n = scanner.nextInt();
        if (n >= 100 && n <= 999) {

            int hunderts = n / 100;
            int dozens = (n / 10) % 10;
            int units = n % 10;
            int sum = hunderts + dozens + units;

            System.out.println("Вы ввели число: " + n);
            System.out.println("Первая цифра (сотни): " + hunderts);
            System.out.println("Вторая цифра (десятки): " + dozens);
            System.out.println("Третья цифра (единицы): " + units);
            System.out.println("Сумма цифр: " + hunderts + " + " + dozens + " + " + units + " = " + sum);
        } else {
            System.out.println("Ошибка! Введите трёхзначное число (от 100 до 999).");
        }
        scanner.close();
    }
}