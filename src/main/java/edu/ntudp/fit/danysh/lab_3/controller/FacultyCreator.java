package edu.ntudp.fit.danysh.lab_3.controller;

import edu.ntudp.fit.danysh.lab_3.model.Faculty;
import edu.ntudp.fit.danysh.lab_3.model.Human;
import edu.ntudp.fit.danysh.lab_3.model.Department;
import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, ArrayList<Department> departments) {
        return new Faculty(name, head, departments);
    }

    public Faculty createTypicalFaculty() {
        HumanCreator humanCreator = new HumanCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();

        ArrayList<Department> departments = new ArrayList<>();

        departments.add(departmentCreator.createTypicalDepartment());
        departments.add(departmentCreator.createTypicalDepartment());

        return new FacultyCreator().createFaculty("PMZKS", humanCreator.createTypicalHuman(), departments);
    }
}
