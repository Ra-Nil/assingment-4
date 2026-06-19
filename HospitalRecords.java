class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTreatmentPlan() {
        return "General treatment plan.";
    }
}

class InPatient extends Patient {
    private int roomNumber;

    public InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    public String getTreatmentPlan() {
        return getName() + " is admitted in room " + roomNumber + " and needs full-time care.";
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String getTreatmentPlan() {
        return getName() + " has an appointment on " + appointmentDate + ".";
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("Ram", 45, 205),
            new OutPatient("Sita", 30, "2026-06-25")
        };

        for (Patient patient : patients) {
            System.out.println(patient.getTreatmentPlan());
        }
    }
}