import model.Gender;
import model.IsOnline;
import model.Student;
import model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Service {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<ArrayList> arrayLists = new ArrayList<>();

    Teacher teacher1 = new Teacher("GV01", "Trang", Gender.MALE, LocalDate.of(1970, 1, 1),"trang@gmail.com", "0968616076", 2, "Tiếng Anh");
    Teacher teacher2 = new Teacher("GV02", "Hải", Gender.FEMALE, LocalDate.of(1972, 1, 2),"hai@gmail.com", "0968655576", 3, "Tiếng Hàn");
    Student student1 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(1999, 1, 3), "tuan@gmail.com", "0123456789", IsOnline.YES, "Đi làm");
    Student student2 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(1998, 2, 4), "tuan@gmail.com", "0123456789",IsOnline.YES, "Đi làm");
    Student student3 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(1998, 3, 5), "tuan@gmail.com", "0123456789",IsOnline.YES, "Đi làm");
    Student student4 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(2000, 4, 6), "tuan@gmail.com", "0123456789",IsOnline.YES, "Đi làm");
    Student student5 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(1998, 5, 7), "tuan@gmail.com", "0123456789",IsOnline.YES, "Đi làm");
    Student student6 = new Student("HS01", "Tuấn", Gender.FEMALE, LocalDate.of(1990, 6, 8), "tuan@gmail.com", "0123456789",IsOnline.YES, "Đi làm");




    public void xuat(){
        teachers.add(teacher1);
        teachers.add(teacher2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        arrayLists.add(teachers);
        arrayLists.add(students);
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i).toString());
        }
    }

    public void timKiem(Scanner sc){
        System.out.println("Nhập từ khóa muốn tìm kiếm");
        String keyWord = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(keyWord) || students.get(i).getEmail().equalsIgnoreCase(keyWord) || students.get(i).getPhoneNumber().equalsIgnoreCase(keyWord)){
                System.out.println(students.get(i).toString());
            }
        }
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getName().equalsIgnoreCase(keyWord) || teachers.get(i).getEmail().equalsIgnoreCase(keyWord) || teachers.get(i).getPhoneNumber().equalsIgnoreCase(keyWord)){
                System.out.println(teachers.get(i).toString());
            }
        }
    }

    public void sapXepTheoTen(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
             Student s1 = (Student)o1;
             Student s2 = (Student)o2;
             return s1.getName().compareTo(s2.getName());
            }
        });
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                Teacher t1 = (Teacher) o1;
                Teacher t2 = (Teacher) o2;
                return t1.getName().compareTo(t2.getName());
            }
        });

        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i).toString());
        }
    }

    public void sapXepTheoTuoi(){
       Collections.sort(students, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               if (o1.getBirthDay().getYear() > o2.getBirthDay().getYear()){
                   return 1;
               }else if (o1.getBirthDay().getYear() < o2.getBirthDay().getYear()){
                   return -1;
               }else {
                   return 0;
               }
           }
       });
       Collections.sort(teachers, new Comparator<Teacher>() {
           @Override
           public int compare(Teacher o1, Teacher o2) {
               if (o1.getBirthDay().getYear() > o2.getBirthDay().getYear()){
                   return 1;
               }else if (o1.getBirthDay().getYear() < o2.getBirthDay().getYear()){
                   return -1;
               }else {
                   return 0;
               }
           }
       });

        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i).toString());
        }
    }
}
