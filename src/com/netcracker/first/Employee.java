package com.netcracker.first;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String name = new String(firstName + " " + lastName);
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        int annualSalary = salary * 12;
        return annualSalary;
    }

    public int raiseSalary(int percent) {
        double raisedSalary = salary * (1 + ((double)percent/100));
        this.salary = (int)raisedSalary;
        return salary;
    }

    @Override
    public String toString() {
        String str = new String ("Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]");
        return str;
    }

}
