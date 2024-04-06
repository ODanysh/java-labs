package edu.ntudp.fit.danysh.lab_3.controller;

import edu.ntudp.fit.danysh.lab_3.model.Sex;
import edu.ntudp.fit.danysh.lab_3.model.Student;
import edu.ntudp.fit.danysh.lab_3.model.Human;

public class StudentCreator  {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex, String id) {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createHuman(firstName, lastName, middleName, sex);
        return new Student(human.getFirstName(), human.getLastName(), human.getPatronymic(), human.getSex(), id);
    }

    public Student createTypicalStudent() {
        return new StudentCreator().createStudent("Bogdan", "Bogdanov", "Bogdanovich", Sex.Male, "234561");
    }
}
