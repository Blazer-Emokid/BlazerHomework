package homework4;

import java.util.Scanner;

public class ATM {
    private int count20;
    private int count50;
    private int count100;

    // Конструктор с тремя параметрами
    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int count20, int count50, int count100) {
        if (count20 >= 0 && count50 >= 0 && count100 >= 0) {
            this.count20 += count20;
            this.count50 += count50;
            this.count100 += count100;
            System.out.println("Деньги успешно добавлены в банкомат.");
        } else {
            System.out.println("Ошибка: количество купюр не может быть отрицательным!");
        }
    }

    // Метод для снятия денег
    public boolean withdraw(int amount) {
        // Проверка на корректность суммы
        if (amount <= 0) {
            System.out.println("Ошибка: сумма для снятия должна быть положительной!");
            return false;
        }

        if (amount % 10 != 0) {
            System.out.println("Ошибка: банкомат выдает только суммы кратные 10!");
            return false;
        }

        // Проверка общей суммы в банкомате
        int totalAmount = getTotalAmount();
        if (amount > totalAmount) {
            System.out.println("Ошибка: недостаточно средств в банкомате!");
            System.out.println("Доступно: " + totalAmount + " долларов");
            return false;
        }

        // Сохраняем текущее состояние
        int savedCount20 = count20;
        int savedCount50 = count50;
        int savedCount100 = count100;

        // Пробуем подобрать комбинацию купюр
        int max100 = Math.min(amount / 100, count100);

        for (int i = max100; i >= 0; i--) {
            int remainingAfter100 = amount - i * 100;
            int max50 = Math.min(remainingAfter100 / 50, count50);

            for (int j = max50; j >= 0; j--) {
                int remainingAfter50 = remainingAfter100 - j * 50;

                if (remainingAfter50 % 20 == 0) {
                    int needed20 = remainingAfter50 / 20;

                    if (needed20 >= 0 && needed20 <= count20) {
                        // Выводим информацию о выдаче
                        System.out.println("\nВыдано " + amount + " долларов:");
                        if (i > 0) System.out.println(i + " купюр(ы) по 100 долларов");
                        if (j > 0) System.out.println(j + " купюр(ы) по 50 долларов");
                        if (needed20 > 0) System.out.println(needed20 + " купюр(ы) по 20 долларов");

                        // Обновляем количество купюр
                        count100 -= i;
                        count50 -= j;
                        count20 -= needed20;

                        return true;
                    }
                }
            }
        }

        // Восстанавливаем состояние
        count20 = savedCount20;
        count50 = savedCount50;
        count100 = savedCount100;

        System.out.println("Ошибка: невозможно выдать запрошенную сумму имеющимися купюрами!");
        return false;
    }

    // Метод для получения общей суммы
    public int getTotalAmount() {
        return count20 * 20 + count50 * 50 + count100 * 100;
    }

    // Метод для вывода информации о банкомате
    public void displayInfo() {
        System.out.println("\n=== Текущее состояние банкомата ===");
        System.out.println("Купюр по 20 долларов: " + count20 + " шт. (на сумму " + (count20 * 20) + " долларов)");
        System.out.println("Купюр по 50 долларов: " + count50 + " шт. (на сумму " + (count50 * 50) + " долларов)");
        System.out.println("Купюр по 100 долларов: " + count100 + " шт. (на сумму " + (count100 * 100) + " долларов)");
        System.out.println("Общая сумма в банкомате: " + getTotalAmount() + " долларов");
        System.out.println("==================================\n");
    }
}