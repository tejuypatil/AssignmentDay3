package com.employee.wage;

import static java.lang.Math.random;

public class EmpWage {

    final static int WAGE_PER_HOUR = 20;
    final static int FULL_Day_HOUR = 8;
    final static int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");

        int dailyEmpWage ;
        int randomCheck = (int) Math.round(random() * 2);
        int partTimeEmpWage;

        switch (randomCheck) {
            case 1:
                System.out.println("Employee is present Full time");
                dailyEmpWage = WAGE_PER_HOUR * FULL_Day_HOUR;
                System.out.println("Employee wage is :" + dailyEmpWage);
                break;
            case 2:
                System.out.println("Employee is present Part Time");
                partTimeEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee wage is :" + partTimeEmpWage);
                break;
            default:
                System.out.println("Employee is absent");
        }

    }
}
