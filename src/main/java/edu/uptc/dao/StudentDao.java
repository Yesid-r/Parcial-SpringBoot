package edu.uptc.dao;

import edu.uptc.model.Student;

public class StudentDao extends AbstractDao<Student> {

    public StudentDao() {

        setEntityClass(Student.class);
    }
}
