package com.bridgelabz;

public class EmployeePayrollData {
    public int employeeID;
    public String employeeName;
    public double employeeSalary;

    public EmployeePayrollData(int employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "EMPLOYEE ID=" + employeeID +
                ", EMPLOYEE NAME='" + employeeName + '\'' +
                ", EMPLOYEE SALARY=" + employeeSalary +
                '}';
}
}
