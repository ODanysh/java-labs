package edu.ntudp.fit.danysh.lab_3.controller;

import edu.ntudp.fit.danysh.lab_3.model.*;
import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human head, ArrayList<Faculty> faculties) {
        return new University(name, head, faculties);
    }

    public University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        ArrayList<Faculty> faculties = new ArrayList<>();

        faculties.add(facultyCreator.createTypicalFaculty());
        faculties.add(facultyCreator.createTypicalFaculty());

        return new UniversityCreator().createUniversity("NTU DP", humanCreator.createTypicalHuman(), faculties);
    }
}
