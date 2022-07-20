package com.company;

import java.util.Scanner;

public class Main {



        public static void main(String[] args) throws LimitException {
            BankAmount bankAmount= new BankAmount();
            //System.out.println("Счёт клиента : "+ bankAmount.getAmount());
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Сколко денег хотите положит : ");
            double amount = scanner.nextInt();
            bankAmount.deposit(200000);
           // System.out.println("Счёт клиента : "bankAmount.deposit(20000));



            while (true) {


                System.out.println("Сколко денег хотите снят :");
                double amount1 = scanner.nextInt();
                bankAmount.withDraw(0);
                try {
                    bankAmount.withDraw(3000);
                }catch (LimitException ie){
                    System.out.println(ie.getMessage());
                }
            }


    }

}
