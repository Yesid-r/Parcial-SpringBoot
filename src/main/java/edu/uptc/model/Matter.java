package edu.uptc.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Matter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(length = 45, nullable = false)
    private String description;

    @Column(length = 45, nullable = false)
    private String credits;

    @OneToMany(mappedBy = "student")
    private List<Student_has_matter> student_has_matters;

    public Matter(String description, String credits) {
        this();
        this.description = description;
        this.credits = credits;
    }

    public Matter() {
        student_has_matters = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public List<Student_has_matter> getStudent_has_matters() {
        return student_has_matters;
    }

    public void setStudent_has_matters(List<Student_has_matter> student_has_matters) {
        this.student_has_matters = student_has_matters;
    }

    @Override
    public String toString() {
        return "Matter{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", credits='" + credits + '\'' +
                ", student_has_matters=" + student_has_matters +
                '}';
    }
}
