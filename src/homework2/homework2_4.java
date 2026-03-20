package homework2;

class homework2_4 {
    public static void main(String[] args) {
        System.out.println("Последовательность чисел, кратных 7:");

        int number = 7;

        while (number <= 98) {
            System.out.print(number);

            // Добавляем запятую и пробел, если это не последнее число
            if (number < 98) {
                System.out.print(", ");
            }

            number += 7;
        }

        System.out.println();
    }
}