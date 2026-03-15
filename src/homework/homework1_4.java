package homework;

import java.util.Scanner;

public class homework1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число (с дробной частью): ");
        float n = (float) scanner.nextDouble();
        float fractionalPart = n - (int) n;

        if (Math.abs(fractionalPart) > 0.000001) {
            long rounded = Math.round(n);
            System.out.println("Вы ввели число: " + n);
            System.out.println("Дробная часть: " + fractionalPart);
            System.out.println("Округлённое число: " + rounded);

        } else {
            System.out.println("Ошибка! Число должно иметь ненулевую дробную часть.");
        }

        scanner.close();
    }
}


