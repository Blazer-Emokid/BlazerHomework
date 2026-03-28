package homework4;

import java.util.Scanner;

public class homework4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Давайте поиграем в банкомат ===\n");

        // Инициализация банкомата
        System.out.println("Для начала работы необходимо загрузить банкомат купюрами.");
        System.out.print("Введите количество купюр номиналом 20 долларов: ");
        int init20 = scanner.nextInt();

        System.out.print("Введите количество купюр номиналом 50 долларов: ");
        int init50 = scanner.nextInt();

        System.out.print("Введите количество купюр номиналом 100 долларов: ");
        int init100 = scanner.nextInt();

        ATM atm = new ATM(init20, init50, init100);
        atm.displayInfo();

        // Основной цикл работы
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Снять деньги");
            System.out.println("2 - Добавить деньги в банкомат");
            System.out.println("3 - Показать состояние банкомата");
            System.out.println("4 - Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Снятие денег
                    System.out.print("Введите сумму для снятия: ");
                    int withdrawAmount = scanner.nextInt();

                    boolean success = atm.withdraw(withdrawAmount);

                    if (success) {
                        System.out.println("\nОперация выполнена успешно!");
                    } else {
                        System.out.println("\nОперация не выполнена!");
                    }

                    // Выводим остаток денег
                    atm.displayInfo();
                    break;

                case 2:
                    // Добавление денег
                    System.out.println("\nВведите количество добавляемых купюр:");
                    System.out.print("Купюр по 20 долларов: ");
                    int add20 = scanner.nextInt();
                    System.out.print("Купюр по 50 долларов: ");
                    int add50 = scanner.nextInt();
                    System.out.print("Купюр по 100 долларов: ");
                    int add100 = scanner.nextInt();

                    atm.addMoney(add20, add50, add100);
                    atm.displayInfo();
                    break;

                case 3:
                    // Показ состояния
                    atm.displayInfo();
                    break;

                case 4:
                    // Выход
                    System.out.println("Приходите, если снова захотите поиграть в банкомат!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Неверный выбор! Пожалуйста, выберите действие от 1 до 4.");
            }

            System.out.println();
        }

        scanner.close();
    }
}