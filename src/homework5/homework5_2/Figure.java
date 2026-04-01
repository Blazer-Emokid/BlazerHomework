package homework5.homework5_2;

public abstract class Figure {
    // Абстрактный метод вывода имени фигуры3
    public abstract String getFigureName();

    // Абстрактный метод для подсчета площади
    public abstract double getArea();

    // Абстрактный метод для подсчета периметра
    public abstract double getPerimeter();

    // Метод для вывода информации о фигуре
    public void displayInfo() {
        System.out.println("Фигура: " + getFigureName());
        System.out.println("Площадь: " + String.format("%.2f", getArea()) + " квадратных сантиметров");
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()) + " см.");
        System.out.println("------------------------");
    }
}