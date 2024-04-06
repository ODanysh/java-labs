package edu.ntudp.fit.danysh.lab_3.view;

import edu.ntudp.fit.danysh.lab_3.model.*;

import java.util.List;

public class Printer {

    public void printUniversityTree(University University) {
        Human head = University.getHead();
        System.out.println("University: " + University.getName()+ ", Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Faculty> Faculties = University.getListChildStructures();
        for (edu.ntudp.fit.danysh.lab_3.model.Faculty Faculty : Faculties) {
            printFacultyTree(Faculty);
        }
    }

    public void printFacultyTree(Faculty Faculty) {
        Human head = Faculty.getHead();
        System.out.println("\t- Faculty: " + Faculty.getName() + ", Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Department> Departments = Faculty.getListChildStructures();
        for (edu.ntudp.fit.danysh.lab_3.model.Department Department : Departments) {
            printDepartmentTree(Department);
        }
    }

    public void printDepartmentTree(Department Department) {
        Human head = Department.getHead();
        System.out.println("\t\t- Department: " + Department.getName() + ", Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Group> Groups = Department.getListChildStructures();
        for (edu.ntudp.fit.danysh.lab_3.model.Group Group : Groups) {
            printGroupTree(Group);
        }
    }

    public void printGroupTree(Group Group) {
        Human head = Group.getHead();
        System.out.println("\t\t\t- Group " + Group.getName() + ", Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Student> Students = Group.getListChildStructures();
        for (Student Student : Students) {
            System.out.println("\t\t\t\t- Student: " + Student.getFirstName() + " " + Student.getLastName() + " | Id: " + Student.getStudentId());
        }
    }
}