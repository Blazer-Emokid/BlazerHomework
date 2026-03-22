package homework1;

import java.util.Scanner;

public class homework1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q, w;
        System.out.println("Введите целое число q : ");
        q = scanner.nextInt();
        System.out.println("Введите целое число w : ");
        w = scanner.nextInt();
        if (q > 0 && w > 0) {
            int result = q / w;
            int ostatok = q % w;
            System.out.println("\nРезультат деления:");
            System.out.println(q + " / " + w + " = " + result + " и " + ostatok + " в остатке.");
        } else {
            System.out.println("Оба числа должны быть натуральными!");
        }
        scanner.close();
    }
}
