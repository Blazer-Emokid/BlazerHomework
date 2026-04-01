package homework5.homework5_1;

// Главный класс для тестирования
public class Homework5_1 {

    // Метод для вывода текста с эффектом печатной машинки
    private static void typeWriter(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Метод для вывода строки с эффектом печатной машинки и задержкой между строками
    private static void printWithDelay(String text) {
        typeWriter(text); // 50 миллисекунд на символ
        try {
            Thread.sleep(1000); // 1 секунда между строками
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        printWithDelay("=== Клиника 'Здоровье' ===\n");

        // Создаем терапевта (он будет назначать врачей)
        Therapist therapist = new Therapist();

        // Создаем пациентов с разными планами лечения
        Patient patient1 = new Patient("Иван Петров", 1);  // Хирург
        Patient patient2 = new Patient("Мария Моржикова", 2); // Стоматолог
        Patient patient3 = new Patient("Алексей Иванов", 3); // Терапевт

        // Создаем массив пациентов
        Patient[] patients = {patient1, patient2, patient3};

        // Для каждого пациента назначаем врача и проводим лечение
        for (Patient patient : patients) {
            printWithDelay("\n" + "=".repeat(50));

            // Выводим информацию о пациенте с эффектом печатной машинки
            String[] infoLines = {
                    "\n=== Информация о пациенте ===",
                    "Имя: " + patient.getName(),
                    "План лечения (код): " + patient.getTreatmentPlan(),
                    "Врач еще не назначен"
            };

            for (String line : infoLines) {
                typeWriter(line);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Терапевт назначает врача согласно плану лечения
            therapist.assignDoctor(patient);

            // Пациент получает лечение
            patient.receiveTreatment();

            printWithDelay("=".repeat(50));
        }
    }
}