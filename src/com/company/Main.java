package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = initStudents();
        Collections.sort(studentList, new AgeComparator());
        System.out.println("Сортировка по возрасту");
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            System.out.println(s.getName() + " " + s.getSurname() + " " + s.getAge());
        }
        List<Student> sortedStudentList = sortBySurname(studentList);
        System.out.println(" ");
        System.out.println("Фамилии на А");
        for (int i = 0; i < sortedStudentList.size(); i++) {
            Student s1 = sortedStudentList.get(i);
            System.out.println(s1.getSurname());
        }

        double sum = 0;
        for (int j = 0; j < studentList.size(); j++) {
            Student s = studentList.get(j);
            sum += s.getAge();
        }
        double average = sum / studentList.size();
        System.out.println(" ");
        System.out.println("Средний возраст студентов " + average);
    }


    private static ArrayList<Student> initStudents() {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "Ivan", "Ivanov", 22));
        studentList.add(new Student(2, "Petr", "Petrov", 34));
        studentList.add(new Student(3, "Sidor", "Sidorov", 25));
        studentList.add(new Student(4, "Andrey", "Andreev", 24));
        studentList.add(new Student(5, "Alex", "Alexeev", 18));
        studentList.add(new Student(6, "Olga", "Kuznetsova", 20));
        studentList.add(new Student(7, "Semen", "Semenov", 19));
        studentList.add(new Student(8, "Anton", "Antonov", 27));
        studentList.add(new Student(9, "Vera", "Pavlova", 21));
        studentList.add(new Student(10, "James", "Bond", 30));
        return studentList;
    }

    private static ArrayList<Student> sortBySurname(List<Student> studentList) {
        ArrayList<Student> sortedStudentList = new ArrayList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getSurname().startsWith("A"))
                sortedStudentList.add(studentList.get(i));
        }
        return sortedStudentList;
    }
}
