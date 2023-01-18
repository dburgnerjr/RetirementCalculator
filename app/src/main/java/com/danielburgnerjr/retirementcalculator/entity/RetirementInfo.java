package com.danielburgnerjr.retirementcalculator.entity;

public class RetirementInfo {
    private double salary;          // salary
    private double employeeCont;    // employee contribution percentage
    private double employerCont;    // employer contribution percentage
    private int payFrequency;       // how often employee gets paid
    private double rateReturn;      // investment rate of return
    private int yearsUntilRetire;   // years until retirement age
    private boolean overFifty;      // is employer over fifty

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeCont(double employeeCont) {
        this.employeeCont = employeeCont;
    }

    public double getEmployeeCont() {
        return employeeCont;
    }

    public void setEmployerCont(double employerCont) {
        this.employerCont = employerCont;
    }

    public double getEmployerCont() {
        return employerCont;
    }

    public void setPayFrequency(int payFrequency) {
        this.payFrequency = payFrequency;
    }

    public int getPayFrequency() {
        return payFrequency;
    }

    public void setRateReturn(double rateReturn) {
        this.rateReturn = rateReturn;
    }

    public double getRateReturn() {
        return rateReturn;
    }

    public void setYearsUntilRetire(int yearsUntilRetire) {
        this.yearsUntilRetire = yearsUntilRetire;
    }

    public int getYearsUntilRetire() {
        return yearsUntilRetire;
    }

    public void setOverFifty(boolean overFifty) {
        this.overFifty = overFifty;
    }

    public boolean isOverFifty() {
        return overFifty;
    }
}
