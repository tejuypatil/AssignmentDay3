package com.employee.wage;

import static java.lang.Math.random;

public class EmpWage {

    final static int WAGE_PER_HOUR = 20;
    final static int FULL_Day_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");

        int dailyEmpWage=0;
        int randomCheck = (int) Math.round(random());

        if (1 == randomCheck) {
            System.out.println("Employee is present");
            dailyEmpWage = WAGE_PER_HOUR * FULL_Day_HOUR;
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee wage per day is :" + dailyEmpWage);
    }
}
