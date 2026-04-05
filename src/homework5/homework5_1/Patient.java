package homework5.homework5_1;

// Класс Пациент
public class Patient {
    private final String name;
    private int treatmentPlan;  // План лечения (код)
    private Doctor doctor;      // Назначенный врач

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
        this.doctor = null;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void receiveTreatment() {
        if (doctor != null) {
            System.out.println("\n" + name + " приступает к лечению у " + doctor.getName() + "а:");
            doctor.treat();
        } else {
            System.out.println("Ошибка: пациенту не назначен врач!");
        }
    }

    public void showInfo() {
        System.out.println("\n=== Информация о пациенте ===");
        System.out.println("Имя: " + name);
        System.out.println("План лечения (код): " + treatmentPlan);
        if (doctor != null) {
            System.out.println("Назначенный врач: " + doctor.getName());
        } else {
            System.out.println("Врач еще не назначен");
        }
    }
}
