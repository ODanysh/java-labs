package edu.ntudp.fit.danysh.lab_4.model;

import java.util.List;

public class Department extends StructureUnit<Group> {
    public Department(String name, Human head, List<Group> listChildStructures) {
        super(name, head, listChildStructures);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Department department = (Department) o;
        return this.getListChildStructures().equals(department.getListChildStructures());
    }
}