package com.company;



public class BankAmount {
    private double amount;

    public BankAmount() {

    }

    public double getAmount() {

        return amount;
    }

    public void deposit(double sum) {
        System.out.println(amount+sum);
        //return amount + sum;

    }

    public void withDraw(double sum) {
         System.out.println(amount- sum);
        //return amount - sum;
    }
}


