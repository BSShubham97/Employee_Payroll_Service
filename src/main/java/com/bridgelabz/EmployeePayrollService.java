package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList=employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
     try{   System.out.print("ENTER EMPLOYEE ID:: ");
        int id = consoleInputReader.nextInt();
        System.out.print("ENTER EMPLOYEE NAME:: ");
        String name = consoleInputReader.next();
        System.out.print("ENTER EMPLOYEE SALARY:: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }
     catch (Exception e){
     System.out.println("ENTER VALID INPUT");
     }
    }

    private void writeEmployeePayrollData() {
    System.out.println("\nWriting Payroll Roster to Console:\n"+employeePayrollList);
    }

}