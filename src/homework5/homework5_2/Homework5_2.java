package homework5.homework5_2;

import java.util.Scanner;

// Главный класс для тестирования с вводом данных
public class Homework5_2 {

    private static final Scanner scanner = new Scanner(System.in);

    // Метод для вывода с эффектом печатной машинки
    private static void typeWriter(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private static void printWithDelay(String text) {
        typeWriter(text);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Метод для создания треугольника с вводом данных
    private static Triangle createTriangle(int number) {
        System.out.println("\n Треугольник " + number + ":");
        System.out.print("   Введите сторону a (см): ");
        double a = scanner.nextDouble();
        System.out.print("   Введите сторону b (см): ");
        double b = scanner.nextDouble();
        System.out.print("   Введите сторону c (см): ");
        double c = scanner.nextDouble();

        try {
            return new Triangle(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println("   Блин! " + e.getMessage());
            System.out.println("   Попробуйте еще раз:");
            return createTriangle(number);
        }
    }

    // Метод для создания прямоугольника с вводом данных
    private static Rectangle createRectangle(int number) {
        System.out.println("\n Прямоугольник " + number + ":");
        System.out.print("   Введите ширину (см): ");
        double width = scanner.nextDouble();
        System.out.print("   Введите высоту (см): ");
        double height = scanner.nextDouble();

        try {
            return new Rectangle(width, height);
        } catch (IllegalArgumentException e) {
            System.out.println("   Блин! " + e.getMessage());
            System.out.println("   Попробуйте еще раз:");
            return createRectangle(number);
        }
    }

    // Метод для создания круга с вводом данных
    private static Circle createCircle(int number) {
        System.out.println("\n Круг " + number + ":");
        System.out.print("   Введите радиус (см): ");
        double radius = scanner.nextDouble();

        try {
            return new Circle(radius);
        } catch (IllegalArgumentException e) {
            System.out.println("   Блин! " + e.getMessage());
            System.out.println("   Попробуйте еще раз:");
            return createCircle(number);
        }
    }

    // Метод для выбора типа фигуры
    private static int chooseFigureType() {
        System.out.println("\nВыберите тип фигуры:");
        System.out.println("   1 - Треугольник");
        System.out.println("   2 - Прямоугольник");
        System.out.println("   3 - Круг");
        System.out.print("Ваш выбор: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        printWithDelay("--------------------------------------------------");
        printWithDelay("|   Расчет площади и периметра фигур       |");
        printWithDelay("|   Введите данные для 5 фигур             |");
        printWithDelay("--------------------------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Создаем массив из 5 фигур
        Figure[] figures = new Figure[5];

        // Заполняем массив фигурами, введенными пользователем
        for (int i = 0; i < figures.length; i++) {
            printWithDelay("\n" + "=".repeat(50));
            printWithDelay("Фигура " + (i + 1) + " из " + figures.length);

            int choice = chooseFigureType();

            switch (choice) {
                case 1:
                    figures[i] = createTriangle(i + 1);
                    break;
                case 2:
                    figures[i] = createRectangle(i + 1);
                    break;
                case 3:
                    figures[i] = createCircle(i + 1);
                    break;
                default:
                    System.out.println(" Неверный выбор! Создаем треугольник по умолчанию.");
                    figures[i] = new Triangle(3, 4, 5);
            }

            printWithDelay(" Фигура успешно создана!");
        }

        // Выводим информацию о всех фигурах
        printWithDelay("\n\n--------------------------------------------------");
        printWithDelay("|||         Результаты расчетов              |||");
        printWithDelay("--------------------------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        double totalPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            printWithDelay("\n Фигура " + (i + 1) + ":");
            figures[i].displayInfo();
            totalPerimeter += figures[i].getPerimeter();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Выводим сумму периметров всех фигур
        printWithDelay("\n" + "═".repeat(50));
        printWithDelay(" СУММА ПЕРИМЕТРОВ ВСЕХ ФИГУР:");
        printWithDelay(String.format("   %.2f см", totalPerimeter));
        printWithDelay("═".repeat(50));

        // Дополнительная информация
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        printWithDelay("\n  Программа завершена  ");
        printWithDelay("Спасибо за использование!");

        scanner.close();
    }
}