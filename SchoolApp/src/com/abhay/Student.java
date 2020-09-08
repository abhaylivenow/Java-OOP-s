package com.abhay;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private int totalfees;
    private int feespaid;
    private int grade;

    public Student(int id,String name,int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.totalfees = 50000;
        this.feespaid = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalfees() {
        return totalfees;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getGrade() {
        return grade;
    }

    public void payFees(int fees, School school){

        feespaid = fees+feespaid;
        school.updateTotalMoneyEarned(fees);
        System.out.println(name+ ", paid the amount " + fees);
    }
    public void remainingFees(){
        int feesLeft = totalfees - feespaid;
        System.out.println("Student still have to pay, "+feesLeft);

    }

}
