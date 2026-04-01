package homework5.homework5_1;

// Класс Стоматолог
public class Dentist extends Doctor {
    public Dentist() {
        super("Стоматолог");
    }

    @Override
    public void treat() {
        System.out.println("Стоматолог проводит лечение зубов: удаляет кариес, ставит пломбу.");
        System.out.println("Пациенту даны рекомендации по уходу за полостью рта.");
    }
}