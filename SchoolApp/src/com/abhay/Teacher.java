package com.abhay;

public class Teacher {

    private int id;
    private String name;
    private int Salary;
    private int salaryEarned;

    public Teacher(int id, String name, int Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }
    public void setSalary(){
        this.Salary = Salary;
    }


    public void receivedSalary(int salary, School school){
        salaryEarned = salaryEarned+salary;
        school.updateTotalMoneySpent(salary);
        System.out.println(name+ " , received salary " + salary);

    }
    public void totalSalaryEarned(){
        System.out.println("Total Salary earned by "+name+" is " + salaryEarned);
    }
}
