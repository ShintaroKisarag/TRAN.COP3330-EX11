/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        double currency;
        double rate;
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        currency = input.nextDouble();  //stores currency
        System.out.print("What is the exchange rate? ");
        rate = input.nextDouble();  //stores rate
        System.out.println(currency+" euros at an exchange rate of "+rate+" is");
        double currencyExchange = currency*rate;    //calculate currency exchange
        System.out.printf("%.2f U.S dollars.",currencyExchange);

    }

}