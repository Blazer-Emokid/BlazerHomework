package homework4;

public class homework4_1 {

    public static void main(String[] args) {
        // Создание трех объектов CreditCard
        CreditCard card1 = new CreditCard("1234 5678 9012 3456", 500.0);
        CreditCard card2 = new CreditCard("2345 6789 0123 4567", 1000.0);
        CreditCard card3 = new CreditCard("3456 7890 1234 5678", 750.0);

        System.out.println("=== Начальное состояние карт ===");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        System.out.println("\n=== Выполнение операций ===");

        // Положить деньги на первую карточку
        card1.deposit(300.0);

        // Положить деньги на вторую карточку
        card2.deposit(500.0);

        // Снять деньги с третьей карточки
        card3.withdraw(200.0);

        System.out.println("\n=== Текущее состояние всех карт ===");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}