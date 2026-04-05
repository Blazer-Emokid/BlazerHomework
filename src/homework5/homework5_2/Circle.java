package homework5.homework5_2;

// Класс Круг
public class Circle extends Figure {
    private final double radius; // радиус

    // Константа PI
    private static final double PI = Math.PI;

    // Конструктор
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Радиус круга должен быть положительным!");
        }
    }

    @Override
    public String getFigureName() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // Длина окружности
        return 2 * PI * radius;
    }

    // Геттер
    public double getRadius() { return radius; }
}
