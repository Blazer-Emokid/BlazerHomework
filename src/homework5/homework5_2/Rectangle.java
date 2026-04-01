package homework5.homework5_2;

// Класс Прямоугольник
public class Rectangle extends Figure {
    private final double width;  // ширина
    private final double height; // высота

    // Конструктор
    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными!");
        }
    }

    @Override
    public String getFigureName() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Геттеры
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
