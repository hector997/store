package com.hectorvillarino;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Sell {

    String path = "/Users/hector/IdeaProjects/resources/stockFile.csv";
    String lineToBuy = "";
    String[] values;

    {
        System.out.print(":: enter the id of the product : " );
        Scanner scanner = new Scanner(System.in);
        String inputId = scanner.nextLine();

        System.out.println(":: input:" + inputId);

        BufferedReader reader;

                try {
                    reader = new BufferedReader(new FileReader(path));

                    while ((lineToBuy = reader.readLine()) != null ) {
                        String[] values = lineToBuy.split(";");
                        String line = (":: id: "+ values[0] + " - product: " + values[1] + " - stock left: " + values[3] + " - Price: $" + values[4]);
                        if(inputId.equals(values[0])){
                            System.out.println(":: match found");
                            System.out.println(line);

                            System.out.print(":: purchase? y/n  ");
                            Scanner scanner2 = new Scanner(System.in);
                            String selectedProd = scanner2.nextLine();

                            System.out.print(":: quantity? ");
                            Scanner qty = new Scanner(System.in);
                            int selectedQty = qty.nextInt();

                            int availableStock = Integer.parseInt(values[3]);
                            int unitPrice = Integer.parseInt(values[4]);
                            int totalToPay = selectedQty * unitPrice;

                            if( selectedProd.contains("y") && selectedQty < availableStock){

                                System.out.println(":: you purchased: " + values[1] + " x " + selectedQty + " for: $" + totalToPay);

                            }else if(selectedProd.contains("y") && selectedQty > availableStock){

                                System.out.println(":: Sorry, we don't have that quantity in stock");

                            }else{

                                System.out.println(":: error in the purchase");
                            }
                            break;
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


    }


}

