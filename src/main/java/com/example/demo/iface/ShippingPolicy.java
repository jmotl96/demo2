package com.example.demo.iface;

import com.example.demo.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
