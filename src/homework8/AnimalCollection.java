package homework8;

import java.util.LinkedList;
import java.util.List;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        if (animal != null && !animal.trim().isEmpty()) {
            animals.addFirst(animal);
            System.out.println("Добавлено животное \"" + animal + "\" в начало коллекции");
        } else {
            System.out.println("Ошибка: название животного не может быть пустым");
        }
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Ошибка: коллекция пуста, невозможно удалить животное");
            return null;
        }
        String removedAnimal = animals.removeLast();
        System.out.println("Удалено животное \"" + removedAnimal + "\" из конца коллекции");
        return removedAnimal;
    }

    public List<String> getAllAnimals() {
        return new LinkedList<>(animals);
    }

    public int getSize() {
        return animals.size();
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public void clear() {
        animals.clear();
        System.out.println("Коллекция очищена");
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("Содержимое коллекции (от начала к концу): " + animals);
        }
    }

    public String getFirstAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        return animals.getFirst();
    }

    public String getLastAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        return animals.getLast();
    }
}