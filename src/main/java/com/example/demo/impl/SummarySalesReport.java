package com.example.demo.impl;

import com.example.demo.Sale;
import com.example.demo.iface.SalesReport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummarySalesReport implements SalesReport {
    private final String format = "%-20s%-10.2f%-10.2f%-10.2f\n";

    @Override
    public void generateReport(List<Sale> saleList){
        Map<String, Sale> countryMap = new HashMap<>();

        for (Sale sale : saleList){
            if (!countryMap.containsKey(sale.getContry())){
                countryMap.put(sale.getContry(), new Sale(sale.getContry()));
            }
            Sale totaller = countryMap.get(sale.getContry());
            totaller.setAmount(totaller.getAmount() + sale.getAmount());
            totaller.setTax(totaller.getTax() + sale.getAmount());
            totaller.setShipping(totaller.getShipping() + sale.getShipping());
        }

        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-20s%-10s%-10s%-10s\n",
                "Country",
                "Amount",
                "Tax",
                "Shipping");
        for (Sale sale : countryMap.values()){
            System.out.printf(format,
                    sale.getContry(),
                    sale.getAmount(),
                    sale.getTax(),
                    sale.getShipping());}
    }
}
