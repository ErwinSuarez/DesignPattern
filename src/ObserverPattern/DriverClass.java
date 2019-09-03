package ObserverPattern;

public class DriverClass {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();

        Admissions admissions = new Admissions(doctor);
        ImagingDepartment imagingDepartment = new ImagingDepartment(doctor);

        doctor.setRequest("Philip", "Chest PA", "William");
        doctor.setRequest("John", "Ultrasound Abdomen", "Paul");
        doctor.removeObservers(admissions);
        doctor.setRequest("Philip", "Complete scan(DEXA)", "Fiona" );

    }

}
