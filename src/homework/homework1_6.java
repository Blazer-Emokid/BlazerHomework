package homework;

import java.util.Scanner;

public class homework1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        System.out.println("Введите целое число A : ");
        A = scanner.nextInt();
        System.out.println("Введите целое число B : ");
        B = scanner.nextInt();

        System.out.println("До обмена значения были такими:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        C = A;
        A = B;
        B = C;

        System.out.println("После обмена:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
