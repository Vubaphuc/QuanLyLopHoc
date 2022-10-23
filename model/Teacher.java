package model;

import java.time.LocalDate;

public class Teacher extends User {
    private int yearOfExperiences;
    private String speciality;

    public Teacher() {
    }

    public Teacher(int yearOfExperiences, String speciality) {
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    public Teacher(String id, String name, Gender gender, LocalDate birthDay, String email, String phoneNumber, int yearOfExperiences, String speciality) {
        super(id, name, gender, birthDay, email, phoneNumber);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }



    public int getYearOfExperiences() {
        return yearOfExperiences;
    }

    public void setYearOfExperiences(int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "model.Teacher{" +
                "yearOfExperiences=" + yearOfExperiences +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
