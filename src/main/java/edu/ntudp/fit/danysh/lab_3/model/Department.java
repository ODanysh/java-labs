package edu.ntudp.fit.danysh.lab_3.model;

import java.util.List;

public class Department extends StructureUnit<Group> {
    public Department(String name, Human head, List<Group> listChildStructures) {
        super(name, head, listChildStructures);
    }
}