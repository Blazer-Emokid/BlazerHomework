package homework5.homework5_1;

// Класс Терапевт
public class Therapist extends Doctor {
    public Therapist() {
        super("Терапевт");
    }

    @Override
    public void treat() {
        System.out.println("Терапевт проводит осмотр: измеряет давление, слушает легкие, назначает анализы.");
        System.out.println("Пациенту выписаны лекарства и даны рекомендации по лечению.");
    }

    // Метод для назначения врача согласно плану лечения
    public void assignDoctor(Patient patient) {
        int treatmentPlan = patient.getTreatmentPlan();

        System.out.println("\n=== Назначение врача ===");
        System.out.println("План лечения пациента: " + treatmentPlan);

        if (treatmentPlan == 1) {
            System.out.println("По плану лечения требуется хирургическое вмешательство.");
            patient.setDoctor(new Surgeon());
        } else if (treatmentPlan == 2) {
            System.out.println("По плану лечения требуется стоматологическая помощь.");
            patient.setDoctor(new Dentist());
        } else {
            System.out.println("По плану лечения требуется общая терапия.");
            patient.setDoctor(new Therapist());
        }

        System.out.println("Назначен врач: " + patient.getDoctor().getName());
    }
}