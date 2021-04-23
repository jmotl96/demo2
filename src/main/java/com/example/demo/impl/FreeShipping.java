package com.example.demo.impl;

import com.example.demo.Sale;
import com.example.demo.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {return 0;}
}
