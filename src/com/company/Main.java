package com.company;

import java.util.Scanner;

public class Main {



        public static void main(String[] args) {
            BankAmount bankAmount= new BankAmount();
            System.out.println("Счёт клиента : "+ bankAmount.deposit(200));
            while (true) {


                System.out.println("Сколко денег хотите положит : "+bankAmount.getAmount());
                System.out.println("Сколко денег хотите снят :");
                Scanner scanner = new Scanner(System.in);
                Integer amount = scanner.nextInt();
            }


    }

}
