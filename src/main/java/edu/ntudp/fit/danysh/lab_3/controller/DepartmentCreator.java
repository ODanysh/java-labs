package edu.ntudp.fit.danysh.lab_3.controller;

import edu.ntudp.fit.danysh.lab_3.model.*;

import java.util.ArrayList;

public class DepartmentCreator  {
    public Department createDepartment(String name, Human head, ArrayList<Group> groups) {
        return new Department(name, head, groups);
    }

    public Department createTypicalDepartment() {
        HumanCreator humanCreator = new HumanCreator();
        GroupCreator groupCreator = new GroupCreator();

        ArrayList<Group> groups = new ArrayList<>();

        groups.add(groupCreator.createTypicalGroup());
        groups.add(groupCreator.createTypicalGroup());

        return new DepartmentCreator().createDepartment("PMZKS", humanCreator.createTypicalHuman(), groups);
    }
}
