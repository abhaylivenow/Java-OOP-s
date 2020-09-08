package com.abhay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(1,"t1",1000);
        Teacher t2 = new Teacher(2,"t2",1500);
        Teacher t3 = new Teacher(3,"t3",1200);
        Teacher t4 = new Teacher(4,"t4",1400);

        ArrayList<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(t1);
        TeacherList.add(t2);
        TeacherList.add(t3);
        TeacherList.add(t4);

        Student s1 = new Student(10,"s1",1);
        Student s2 = new Student(20,"s2",1);
        Student s3 = new Student(30,"s3",1);
        Student s4 = new Student(40,"s4",1);
        Student s5 = new Student(50,"s5",2);
        Student s6 = new Student(60,"s6",2);
        Student s7 = new Student(70,"s7",2);
        Student s8 = new Student(80,"s8",2);

        ArrayList<Student> StudentList = new ArrayList<>();
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        StudentList.add(s4);
        StudentList.add(s5);
        StudentList.add(s6);
        StudentList.add(s7);
        StudentList.add(s8);


        School CA = new School(StudentList,TeacherList);

        Student s9 = new Student(90,"s9",3);
        CA.addStudent(s9);

        Teacher t5 = new Teacher(5,"t5",2000);
        CA.addTeacher(t5);

        System.out.println(CA.StudentSize());

        s1.payFees(20000,CA);
        s2.payFees(10000,CA);
        s3.payFees(15000,CA);
        s4.payFees(25000,CA);

        t1.receivedSalary(1000,CA);
        t2.receivedSalary(1000,CA);

        System.out.println(CA.getTotalMoneyEarned());

        System.out.println(CA.getTotalMoneySpent());

    }
}
