package com.hectorvillarino;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stock{

    String path = "/Users/hector/IdeaProjects/resources/stockFile.csv";
    String line = "";
        BufferedReader reader;

    {
        try {
            reader = new BufferedReader(new FileReader(path));

            while((line = reader.readLine()) != null){
                String[] values = line.split(";");
                System.out.println(values[0] + " -- " + values[1] + " -- " + values[2] + " -- " + values[3] + " --  $" + values[4] + " --");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}










