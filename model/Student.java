package model;

import java.time.LocalDate;

public class Student extends User {
    private IsOnline isOnline;
    private String background;

    public Student(String id, String name, Gender gender, LocalDate birthDay, String email, String phoneNumber, IsOnline isOnline, String background) {
        super(id, name, gender, birthDay, email, phoneNumber);
        this.isOnline = isOnline;
        this.background = background;
    }

    public IsOnline getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(IsOnline isOnline) {
        this.isOnline = isOnline;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Student{" +
                "isOnline=" + isOnline +
                ", background='" + background + '\'' +
                '}';
    }


}
