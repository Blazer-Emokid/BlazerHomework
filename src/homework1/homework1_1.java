package homework1;

import java.util.Scanner;

public class homework1_1 {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число b : ");
        b = scanner.nextInt();
        System.out.print("Введите целое число c : ");
        c = scanner.nextInt();
        a = 4 * (b + c - 1) / 2;
        System.out.println("Вычисленное значение А по формуле А=4*(b+c-1)/2 = " + a);

        scanner.close();
    }
}


