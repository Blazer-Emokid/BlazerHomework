package homework5.homework5_1;

// Базовый класс Врач
public abstract class Doctor {
    protected String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Абстрактный метод "лечить", который будет реализован в подклассах
    public abstract void treat();

    public String getName() {
        return name;
    }
}
