interface HealthRecord {
    void recordDetails();
    void displayDetails();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Patient extends Person implements HealthRecord {
    String ailment;
    String treatment;

    public Patient(String name, int id, String ailment, String treatment) {
        super(name, id);
        this.ailment = ailment;
        this.treatment = treatment;
    }


    public void recordDetails() {
        // For simplicity, we just print the recording action.
        System.out.println("Patient details: " + getName());
    }

   
    public void displayDetails() {
        System.out.println("Ailment: " + ailment);
        System.out.println("Treatment: " + treatment);
    }
}

class Doctor extends Person implements HealthRecord {
    String specialization;
    String consultationHours;

    public Doctor(String name, int id, String specialization, String consultationHours) {
        super(name, id);
        this.specialization = specialization;
        this.consultationHours = consultationHours;
    }

  
    public void recordDetails() {
        System.out.println("Doctor details: " + getName());
    }

    public void displayDetails() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Hours: " + consultationHours);
    }
}

public class Helthrecords {
    public static void main(String[] args) {
        Patient patient = new Patient("Snow", 1, "Fever", "Rest");
        Doctor doctor = new Doctor("Dr. Melisa", 101, "General Medicine", "10 AM - 5 PM");

        patient.recordDetails();
        doctor.recordDetails();

        patient.displayDetails();
        doctor.displayDetails();
    }
}
