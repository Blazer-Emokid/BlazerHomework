package homework5.homework5_2;

// Класс Треугольник
public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор
    public Triangle(double sideA, double sideB, double sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException("Некорректные стороны треугольника! Сумма двух сторон должна быть больше третьей.");
        }
    }

    // Проверка существования треугольника
    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }

    @Override
    public String getFigureName() {
        return "Треугольник";
    }

    @Override
    public double getArea() {
        // Формула Герона
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Геттеры
    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }
}