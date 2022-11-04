package edu.uptc.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(name = "birthday", nullable = false)
    private LocalDateTime birthday;

    @Column(length = 10, nullable = false)
    private String phone;

    @OneToMany(mappedBy = "student")
    private List<Student_has_matter>  student_has_matters;

    public Student(String lastName, String name, LocalDateTime birthday, String phone) {
        this();
        this.lastName = lastName;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Student() {
        student_has_matters = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Student_has_matter> getStudent_has_matters() {
        return student_has_matters;
    }

    public void setStudent_has_matters(List<Student_has_matter> student_has_matters) {
        this.student_has_matters = student_has_matters;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", student_has_matters=" + student_has_matters +
                '}';
    }
}
