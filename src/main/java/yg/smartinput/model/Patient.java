package yg.smartinput.model;

/**
 * Created by I076057 on 11/24/2016.
 */
public class Patient {
    private String id;
    private String name;
    private String address;
    private int age;
    private String diagnose;


    private PatientCost patientCost;


    public Patient(String id, String name, PatientCost patientCost) {

        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Patient setAge(int age) {
        this.age = age;
        return this;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public Patient setDiagnose(String diagnose) {
        this.diagnose = diagnose;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Patient setName() {
        this.name = name;
        return this;
    }

    public Patient setAddress() {
        this.address = address;
        return this;
    }

    public void setPatientCost(PatientCost patientCost) {
        this.patientCost = patientCost;
    }


}
