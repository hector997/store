package com.hectorvillarino;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search extends Main {

    static {
        searchMenu();
    }

    public static void searchMenu (){
        int exit = 9;
        System.out.println(":::::::::::::::::::::");
        System.out.println(":::: SEARCH MENU ::::");
        System.out.println(":::::::::::::::::::::");
        System.out.println("1. search by id");
        System.out.println("2. search by category");
        System.out.println("9. go back");
        System.out.print("input: ");
        Scanner scanner = new Scanner(System.in);
        int response1 = Integer.parseInt(scanner.nextLine());
        switch (response1) {
            case 9:
                exit = 9;
                System.out.println("exit");
                menu();
                break;
            case 1:
                System.out.println("enter id to search: ");
                Scanner scr = new Scanner(System.in);
                String idToSearch = scr.nextLine();

                searchById(idToSearch);

                break;
            case 2:
                System.out.println("enter category to search: ");
                Scanner scr2 = new Scanner(System.in);
                String categoryToSearch = scr2.nextLine();

                searchByCategory(categoryToSearch);
                break;
        } while (exit != 9);

    }

    static void searchById(String idToSearch){
        String path = "/Users/hector/IdeaProjects/resources/stockFile.csv";
        String lineToSearch = "";
        String[] values;
        System.out.println("input: " + idToSearch);
        BufferedReader reader;

        try {
            System.out.println("searching..");
            reader = new BufferedReader(new FileReader(path));
            while((lineToSearch = reader.readLine()) != null){

                values = lineToSearch.split(";");
                lineToSearch = (":: " + values[0] + " -- " + values[1] + " -- " + values[2] + " -- " + values[3] + " --  $" + values[4] + " --");

                if(idToSearch.equals(values[0])){
                    System.out.println("search by id result: ");
                    System.out.println(lineToSearch);
                    System.out.println(":::::::::::::::::::::");
                    break;
                }
            }
            System.out.println(":::::::::::::::::::::");
            System.out.println("9. go back");
            System.out.print("input: ");
            Scanner scr3 = new Scanner(System.in);
            int response = scr3.nextInt();
            if(response == 9){
                searchMenu();
            }else{
                System.out.println("bad input");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void searchByCategory(String categoryToSearch){
        String path = "/Users/hector/IdeaProjects/resources/stockFile.csv";
        String lineToSearch2 = "";
        String [] values2;

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            System.out.println("search by category result: ");
            while((lineToSearch2 = reader.readLine()) != null){

                values2 = lineToSearch2.split(";");
                lineToSearch2 = (":: " + values2[0] + " -- " + values2[1] + " -- " + values2[2] + " -- " + values2[3] + " -- $" + values2[4] + " --");

                if(categoryToSearch.equals(values2[2])) {
                    System.out.println(lineToSearch2);

                }
            }
            System.out.println(":::::::::::::::::::::");
            System.out.println("9. go back");
            System.out.print("input: ");
            Scanner scr3 = new Scanner(System.in);
            int response = scr3.nextInt();
            if(response == 9){
                searchMenu();
            }else{
                System.out.println("bad input");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
