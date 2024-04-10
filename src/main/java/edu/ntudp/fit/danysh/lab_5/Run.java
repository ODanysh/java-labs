package edu.ntudp.fit.danysh.lab_5;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class Run {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/JavaDB";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "admin";
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("Enter number of month: ");
                try {
                    int input = scanner.nextInt();
                    if (input < 1 || input > 12) { break; }
                    List<Student> students = getStudentsByMonthOfBirth(connection, input);
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("You should enter number of month.");
                    scanner.nextLine();
                }
            }
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Connection failed" + e);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }

    private static List<Student> getStudentsByMonthOfBirth(Connection connection, int month) throws SQLException {
        List<Student> students = new ArrayList<>();
        String sqlRequest = "SELECT * FROM public.students WHERE EXTRACT(MONTH FROM date_of_birth) = " + month + ";";
        PreparedStatement statement = connection.prepareStatement(sqlRequest);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int student_id = resultSet.getInt("student_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String patronymic = resultSet.getString("patronymic");
            LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();

            Student student = new Student(id, student_id, firstName, lastName, patronymic, dateOfBirth);
            students.add(student);
        }
        return students;
    }
}