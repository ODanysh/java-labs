package edu.ntudp.fit.danysh.lab_4;

import edu.ntudp.fit.danysh.lab_4.controller.UniversityCreator;
import edu.ntudp.fit.danysh.lab_4.model.University;
import edu.ntudp.fit.danysh.lab_4.view.Printer;

public class Run {
    public static void main(String[] args) {
        University oldUniversity = new UniversityCreator().createTypicalUniversity();
        System.out.println("The old university is created");
        JsonManager JsonManager = new JsonManager();
        JsonManager.writeToJson(oldUniversity,"oldUniversityJson");
        System.out.println("The old university is written to file");
        University newUniversity = JsonManager.readFromJson("oldUniversityJson");
        System.out.println("The new university is created");
        System.out.println("Is old university equals to new university?: " + oldUniversity.equals(newUniversity));
    }
}
