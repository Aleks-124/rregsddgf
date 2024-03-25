package org.example;

import java.util.ArrayList;

public class Vuz {
    ArrayList<Person> students = new ArrayList<>();
    ArrayList<Person> teachers = new ArrayList<>();
    public Vuz() {

        StudentFabric studentFabric = new StudentFabric();
        TeacherFabric teacherFabric = new TeacherFabric();
        for(int i = 0; i < 10; i++) {
            students.add(studentFabric.createPerson());
            teachers.add(teacherFabric.createPerson());
        }
    }
    public ArrayList getStudents() {
        return students;
    }
    public ArrayList getTeachers() {
        return teachers;
    }

}
