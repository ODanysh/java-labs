package edu.ntudp.fit.danysh.lab_4.model;

import java.util.List;

public class University extends StructureUnit<Faculty> {

    public University(String name, Human head, List<Faculty> listChildStructures) {
        super(name, head, listChildStructures);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        University university = (University) o;
        return this.getListChildStructures().equals(university.getListChildStructures());
    }
}