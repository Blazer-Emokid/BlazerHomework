package homework;

import java.util.Scanner;

public class homework1_1 {

    public static void main(String[] args) {

        int A, B, C;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число B : ");
        B = scanner.nextInt();
        System.out.print("Введите целое число C : ");
        C = scanner.nextInt();
        A = 4 * (B + C - 1) / 2;
        System.out.println("Вычисленное значение А по формуле А=4*(b+c-1)/2 = " + A);

        scanner.close();
    }
}


