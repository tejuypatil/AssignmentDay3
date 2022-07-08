package com.employee.wage;

import static java.lang.Math.random;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");
        int randomCheck = (int) Math.round(random());
        if (1 == randomCheck) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
