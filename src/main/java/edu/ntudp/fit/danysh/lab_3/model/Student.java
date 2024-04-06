package edu.ntudp.fit.danysh.lab_3.model;

public class Student extends Human {
    private String studentId;
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, String patronymic, Sex sex, String studentId) {
        super(firstName, lastName, patronymic, sex);
        setStudentId(studentId);
    }
}
