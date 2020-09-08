package com.abhay;

import java.util.ArrayList;

public class School {

    private ArrayList<Student> studentList;
    private ArrayList<Teacher> teacherList;
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;

    public School(ArrayList<Student> Student,ArrayList<Teacher> Teacher){
        this.studentList = Student;
        this.teacherList = Teacher;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public ArrayList<Student> getStudent(){
        return studentList;
    }

    public ArrayList<Teacher> teacher(){
        return teacherList;
    }

    public boolean addTeacher(Teacher teacher){

        if(foundTeacher(teacher.getName()) !=null ){
            System.out.println("Cannot be added");
            return false;
        }
        teacherList.add(teacher);
        System.out.println(teacher.getName()+ " , added successfully to the teacher list");
        return true;
    }
    public Teacher foundTeacher(String name){

       for(Teacher teacher : teacherList){
           if(teacher.getName().equals(name)){

               return teacher;
           }
       }
    return null;
    }

    public boolean addStudent(Student student){
        if(foundStudent(student.getName())!=null){
            System.out.println(student.getName() + " , cannot be added to the student list, already exist");
            return false;
        }
        studentList.add(student);
        System.out.println(student.getName() + ", added to the list");
        return true;
    }


    public Student foundStudent(String name){
        for(Student student : studentList){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned += moneyEarned;
    }

    public void updateTotalMoneySpent(int moneySpent){

        totalMoneyEarned-=moneySpent;
        totalMoneySpent+=moneySpent;
    }

    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public int TeacherSize(){
        return teacherList.size();
    }
    public int StudentSize(){
        return studentList.size();
    }

}
