package homework8;

import java.util.Scanner;

public class homework8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalCollection animalCollection = new AnimalCollection();

        System.out.println("=== Коллекция животных ===");
        System.out.println("Правила: животные добавляются в НАЧАЛО, удаляются из КОНЦА");

        boolean running = true;
        while (running) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Добавить животное");
            System.out.println("2. Удалить животное");
            System.out.println("3. Показать всех животных");
            System.out.println("4. Показать размер коллекции");
            System.out.println("5. Очистить коллекцию");
            System.out.println("6. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название животного: ");
                    String animal = scanner.nextLine();
                    animalCollection.addAnimal(animal);
                    break;

                case 2:
                    String removed = animalCollection.removeAnimal();
                    if (removed != null) {
                        System.out.println("Удалено животное: " + removed);
                    }
                    break;

                case 3:
                    animalCollection.displayAnimals();
                    break;

                case 4:
                    System.out.println("Размер коллекции: " + animalCollection.getSize());
                    break;

                case 5:
                    animalCollection.clear();
                    break;

                case 6:
                    running = false;
                    System.out.println("Программа завершена");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}