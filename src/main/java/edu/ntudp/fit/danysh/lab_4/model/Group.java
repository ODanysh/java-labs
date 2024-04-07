package edu.ntudp.fit.danysh.lab_4.model;

import java.util.List;

public class Group extends StructureUnit<Student> {

    public Group(String name, Human head, List<Student> listChildStructures) {
        super(name, head, listChildStructures);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return this.getListChildStructures().equals(group.getListChildStructures());
    }
}
