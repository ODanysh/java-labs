package edu.ntudp.fit.danysh.lab_3;

import edu.ntudp.fit.danysh.lab_3.controller.UniversityCreator;
import edu.ntudp.fit.danysh.lab_3.model.University;
import edu.ntudp.fit.danysh.lab_3.view.Printer;

public class Run {
    public static void main(String[] args) {
        University university = new UniversityCreator().createTypicalUniversity();
        Printer printer = new Printer();
        printer.printUniversityTree(university);

    }
}
