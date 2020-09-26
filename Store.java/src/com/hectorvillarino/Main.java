package com.hectorvillarino;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        menu();
    }
    public static void menu () {
        int exit = 0;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("select category");
            System.out.println("1: show stock");
            System.out.println("2: register sale");
            System.out.println("3: search product");
            System.out.println("0: exit");
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.print("your input : ");

            Scanner scanner = new Scanner(System.in);
            int response = Integer.valueOf(scanner.nextLine());
            switch (response) {
                case 0:
                    exit = 0;
                    System.out.println("exit");
                    break;
                case 1:
                    ShowStock();
                    break;
                case 2:
                    Sales();
                    break;
                case 3:
                    SearchMenu();
                    break;
                default:
                    System.out.println("please select an option");
                    break;
            }

        } while (exit != 0);
    }

    public static void ShowStock(){
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: STOCK ::");
            Stock stock1 = new Stock();
            System.out.println(":: END ::");
            //show entire stock


        }while( exit !=0 );
    }

    public static void Sales(){
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: SELL AN ITEM::");
            Sell sell = new Sell();
            // ask for the product id and seller id
            // check if there is stock and subtract from it
            // calculate the sellers commission using sold qty

        }while( exit !=0 );
    }

    public static void SearchMenu(){
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: SEarch::");
            Search search = new Search();


        }while( exit !=0 );

    // search by id
    }



}
