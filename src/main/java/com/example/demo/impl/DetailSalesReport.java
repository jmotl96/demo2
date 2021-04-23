package com.example.demo.impl;

import com.example.demo.Sale;
import com.example.demo.iface.SalesReport;

import java.util.List;

public class DetailSalesReport implements SalesReport {
    private final String format = "%-30s%-20s%-10.2f%-10.2f%-10.2f\n";

    @Override
    public void generateReport(List<Sale> saleList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-30s%-20s%-10s%-10s%-10s\n",
                "Customer",
                "Country",
                "Amount",
                "Tax",
                "Shipping");
        for (Sale sale : saleList){
            System.out.printf(format,
                    sale.getCustomerName(),
                    sale.getContry(),
                    sale.getAmount(),
                    sale.getTax(),
                    sale.getShipping());
        }
    }
}
