package model;

import java.time.LocalDate;

public class User {
    private String id;
    private String name;
    private Gender gender;
    private LocalDate birthDay;
    private String email;
    private String phoneNumber;
    //hàm không tham số
    public User() {
    }
    //hàm có tham số
    public User(String id, String name, Gender gender, LocalDate birthDay, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // get and set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toSIng

    @Override
    public String toString() {
        return "model.User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
