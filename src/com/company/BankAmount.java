package com.company;



public class BankAmount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        amount =  sum + amount;
    }

    public void withDraw(int sum) throws LimitException {
        amount = amount - sum;
        if (sum > amount) {throw new LimitException("Ощибка! Вы неможете снят денги у вас на балансе менше денег"+ amount);}
}}


