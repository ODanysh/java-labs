package edu.ntudp.fit.danysh.lab_3.model;

import java.util.List;

public abstract class StructureUnit<T> {

    private String name;
    private Human head;

    public List<T> getListChildStructures() {
        return listChildStructures;
    }

    public StructureUnit(String name, Human head, List<T> listChildStructures) {
        this.name = name;
        this.head = head;
        this.listChildStructures = listChildStructures;
    }

    public void setListChildStructures(List<T> listChildStructures) {
        this.listChildStructures = listChildStructures;
    }

    private List<T> listChildStructures;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}