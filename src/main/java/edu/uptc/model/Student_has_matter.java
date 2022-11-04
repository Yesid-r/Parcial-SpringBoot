package edu.uptc.model;

import jakarta.persistence.*;

public class Student_has_matter {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne( fetch = FetchType.LAZY )
    private Student student;

    @ManyToOne( fetch = FetchType.LAZY )
    private Matter matter;

    public Student_has_matter(Student student, Matter matter) {
        this.student = student;
        this.matter = matter;
    }

    public Student_has_matter() {
        this.student = new Student();
        this.matter = new Matter();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Matter getMatter() {
        return matter;
    }

    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    @Override
    public String toString() {
        return "Student_has_matter{" +
                "id='" + id + '\'' +
                ", student=" + student +
                ", matter=" + matter +
                '}';
    }
}
