package edu.ntudp.fit.danysh.lab_3.controller;

import edu.ntudp.fit.danysh.lab_3.model.Human;
import edu.ntudp.fit.danysh.lab_3.model.Sex;

public class HumanCreator {
    public Human createHuman(String firstName, String lastName, String patronymic, Sex sex) {
        return new Human(firstName, lastName, patronymic, sex);
    }

    public Human createTypicalHuman() {
        return new HumanCreator().createHuman("Ivan", "Ivanov", "Ivanovich", Sex.Male);
    }
}
