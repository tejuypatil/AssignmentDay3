package com.employee.wage;

import static java.lang.Math.random;

public class EmpWage {

    final static int WAGE_PER_HOUR = 20;
    final static int FULL_Day_HOUR = 8;
    final static int PART_TIME_HOUR = 4;
    final static int WORKING_DAY = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");

        int dailyEmpWage;
        int workingHours = 0;
        int partTimeEmpWage;
        int wageForMonth = 0;
        int totalHours=0;
        int totalWage=0;

        int day =1;
        while (day <= WORKING_DAY && totalHours <100)
        {
            int randomCheck = (int) Math.round(random() * 2);
            dailyEmpWage = 0;

            switch (randomCheck) {
                case 1:
                    System.out.println("Employee is present Full time");
                    dailyEmpWage = WAGE_PER_HOUR * FULL_Day_HOUR;
                    System.out.println("Employee wage is :" + dailyEmpWage);
                    wageForMonth = WORKING_DAY * dailyEmpWage;
                    workingHours = FULL_Day_HOUR;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    partTimeEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee wage is :" + dailyEmpWage);
                    wageForMonth = WORKING_DAY * partTimeEmpWage;
                    workingHours = PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            totalWage+=wageForMonth;
            totalHours+=workingHours;
            System.out.println("Employee wage on day "+day+":" +wageForMonth);
            System.out.println("Total Working Hours is :"+totalHours );
            day++;
        }
        System.out.println("total employee wage is:"+totalWage);
    }
}
