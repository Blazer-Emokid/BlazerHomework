package homework4;

public class CreditCard {
    private final String accountNumber;
    private double currentAmount;

    // Конструктор
    public CreditCard(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = initialAmount;
    }

    // Метод для начисления суммы на карточку
    public void deposit(double amount) {
        if (amount > 0) {
            currentAmount += amount;
            System.out.println("На карту " + accountNumber + " начислено: " + amount + " руб.");
        } else {
            System.out.println("Ошибка: сумма для начисления должна быть положительной!");
        }
    }

    // Метод для снятия суммы с карточки
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= currentAmount) {
                currentAmount -= amount;
                System.out.println("С карты " + accountNumber + " снято: " + amount + " руб.");
            } else {
                System.out.println("Ошибка: недостаточно средств на карте " + accountNumber + "!");
            }
        } else {
            System.out.println("Ошибка: сумма для снятия должна быть положительной!");
        }
    }

    // Метод для вывода текущей информации о карточке
    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Текущая сумма: " + currentAmount + " руб.");
    }

    // Геттер для номера счёта
    public String getAccountNumber() {
        return accountNumber;
    }

    // Геттер остатка на карте
    public double getCurrentAmount() {
        return currentAmount;
    }
}