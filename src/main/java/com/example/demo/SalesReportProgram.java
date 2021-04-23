package com.example.demo;


import com.example.demo.iface.SalesInput;
import com.example.demo.iface.SalesReport;
import com.example.demo.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportProgram {
    @Autowired
    private ShippingPolicy shippingPolicy;

    @Autowired
    private SalesInput salesInput;

    @Autowired
    private SalesReport salesReport;

    public void runSalesReport(){
        List<Sale> saleList = salesInput.getSales();

        for (Sale sale : saleList){
            sale.setShipping(shippingPolicy.getShippingCost(sale));
        }

        salesReport.generateReport(saleList);
    }
}
