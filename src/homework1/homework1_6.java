package homework1;

import java.util.Scanner;

public class homework1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите целое число A : ");
        a = scanner.nextInt();
        System.out.println("Введите целое число B : ");
        b = scanner.nextInt();

        System.out.println("До обмена значения были такими:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("После обмена:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();
    }
}
