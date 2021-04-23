package com.example.demo.impl;

import com.example.demo.Sale;
import com.example.demo.iface.ShippingPolicy;

public class FlatRateDomesticShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale){
        return sale.getContry().equals("United States") ? 5.99 : sale.getAmount() *.1;
    }
}
