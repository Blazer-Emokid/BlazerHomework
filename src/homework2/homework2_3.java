package homework2;

public class homework2_3 {

    public static void main(String[] args) {
        System.out.println("Квадраты чисел от 10 до 20:");
        System.out.println("─────────────────────────");

        for (int i = 10; i <= 20; i++) {
            double square = Math.pow(i, 2);
            System.out.println(i + " в квадрате = " + (int) square);
        }
    }

}
