package edu.ntudp.fit.danysh.lab_5;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    public int id;
    public int gradebookId;
    public String firstName;
    public String lastName;
    public String patronymic;
    public LocalDate dateOfBirth;
    public Student(int id, int gradebookId, String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        this.id = id;
        this.gradebookId = gradebookId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Student: " +
                "id= " + id +
                ", StudentId= " + gradebookId +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", patronymic= '" + patronymic + '\'' +
                ", dateOfBirth= " + dateOfBirth +
                ';';
    }
}
