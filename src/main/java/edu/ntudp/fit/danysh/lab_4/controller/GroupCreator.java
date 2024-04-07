package edu.ntudp.fit.danysh.lab_4.controller;

import edu.ntudp.fit.danysh.lab_4.model.Group;
import edu.ntudp.fit.danysh.lab_4.model.Human;
import edu.ntudp.fit.danysh.lab_4.model.Student;

import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup(String name, Human head, ArrayList<Student> students) {
        return new Group(name, head, students);
    }

    public Group createTypicalGroup() {
        HumanCreator humanCreator = new HumanCreator();
        StudentCreator studentCreator = new StudentCreator();

        ArrayList<Student> students = new ArrayList<>();

        students.add(studentCreator.createTypicalStudent());
        students.add(studentCreator.createTypicalStudent());

        return new GroupCreator().createGroup("122-20-3", humanCreator.createTypicalHuman(), students);
    }
}
