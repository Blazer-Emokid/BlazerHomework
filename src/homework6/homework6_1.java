package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework6_1 {

    // 1. Метод с try-catch (простая обработка исключения)
    public static void methodWithTryCatch() {
        System.out.println("\n--- Метод 1: try-catch (деление на ноль) ---");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Результат деления " + a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: на ноль делить нельзя! " + e.getMessage());
        }

        System.out.println("Программа продолжает работу...");
    }

    // 2. Метод с несколькими catch-блоками
    public static void methodWithMultipleCatch() {
        System.out.println("\n--- Метод 2: try-catch с несколькими catch блоками ---");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.print("Введите индекс для доступа к элементу: ");
            int index = scanner.nextInt();

            System.out.print("Введите число для деления 100: ");
            int divisor = scanner.nextInt();

            int value = array[index];
            int result = 100 / divisor;

            System.out.println("Значение элемента: " + value);
            System.out.println("Результат деления: " + result);

        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Размер массива не может быть отрицательным! " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за границы массива! " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число! " + e.getMessage());
        }

        System.out.println("Программа продолжает работу...");
    }

    // 3. Метод с multi-catch (Начиная с джавы 7)
    public static void methodWithMultiCatch() {
        System.out.println("\n--- Метод 3: try-catch с multi-catch ---");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку для преобразования в число: ");
            String numberStr = scanner.nextLine();
            int number = Integer.parseInt(numberStr);

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.print("Введите индекс для доступа: ");
            int index = scanner.nextInt();

            array[index] = number;
            System.out.println("Значение " + number + " успешно записано в ячейку " + index);

        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Ошибка: некорректное преобразование строки в число! " + e.getMessage());
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: указан несуществующий индекс элемента массива! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Неверный формат ввода! " + e.getMessage());
        }

        System.out.println("Программа продолжает работу...");
    }

    // 4. Метод с try-catch-finally
    public static void methodWithTryCatchFinally() {
        System.out.println("\n--- Метод 4: try-catch-finally ---");
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Введите числитель: ");
            int numerator = scanner.nextInt();

            System.out.print("Введите знаменатель: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Результат деления: " + numerator + " / " + denominator + " = " + result);

            // Имитация дополнительной операции, которая может вызвать исключение
            int[] testArray = new int[result];
            testArray[10] = 100;

        } catch (ArithmeticException e) {
            System.out.println("Ошибка в блоке catch: Деление на ноль! " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка в блоке catch: Выход за границы массива! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка в блоке catch: Введено не число! " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполняется всегда!");
            if (scanner != null) {
                System.out.println("Закрываем ресурс Scanner в блоке finally");
                scanner.close();
            }
        }

        System.out.println("Программа продолжает работу...");
    }

    // Дополнительный метод для демонстрации всех четырех вариантов
    public static void main(String[] args) {
        System.out.println("=== Демонстрация работы с исключениями ===");
        System.out.println("Программа показывает 4 разных способа обработки исключений");

        // Демонстрация первого метода
        methodWithTryCatch();

        // Демонстрация второго метода
        methodWithMultipleCatch();

        // Демонстрация третьего метода
        methodWithMultiCatch();

        // Демонстрация четвертого метода
        methodWithTryCatchFinally();

        System.out.println("\n=== Программа завершена ===");

    }
}