package com.example.demo.iface;

import com.example.demo.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
