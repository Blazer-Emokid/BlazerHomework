package homework;

import java.util.Scanner;

public class homework1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q, W;
        System.out.println("Введите целое число Q : ");
        Q = scanner.nextInt();
        System.out.println("Введите целое число W : ");
        W = scanner.nextInt();
        if (Q > 0 && W > 0) {
            int result = Q / W;
            int ostatok = Q % W;
            System.out.println("\nРезультат деления:");
            System.out.println(Q + " / " + W + " = " + result + " и " + ostatok + " в остатке.");
        } else {
            System.out.println("Оба числа должны быть натуральными!");
        }
        scanner.close();
    }
}
