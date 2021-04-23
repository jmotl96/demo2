package com.example.demo.impl;

import com.example.demo.Sale;
import com.example.demo.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales(){
        List<Sale> saleList = new ArrayList<>();

        try {
            Scanner reader = new Scanner(new File("sales.txt"));
            while (reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                System.out.println("Array: " +line[0] + line[1] + Double.parseDouble(line[2]) +Double.parseDouble(line[3]));
                Sale sale = new Sale(line[0], line[1], Double.parseDouble(line[2]),Double.parseDouble(line[3]));
                saleList.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return saleList;
    }
}
