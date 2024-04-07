package edu.ntudp.fit.danysh.lab_4.model;

import java.util.List;

public class Faculty extends StructureUnit<Department> {
    public Faculty(String name, Human head, List<Department> listChildStructures) {
        super(name, head, listChildStructures);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return this.getListChildStructures().equals(faculty.getListChildStructures());
    }
}