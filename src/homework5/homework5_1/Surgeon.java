package homework5.homework5_1;

// Класс Хирург
public class Surgeon extends Doctor {
    public Surgeon() {
        super("Хирург");
    }

    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию: делает разрез, удаляет поврежденные ткани и накладывает швы.");
        System.out.println("Пациент направлен в послеоперационную палату для наблюдения.");
    }
}