package com.example.demo;

import com.example.demo.iface.SalesInput;
import com.example.demo.iface.SalesReport;
import com.example.demo.iface.ShippingPolicy;
import com.example.demo.impl.DetailSalesReport;
import com.example.demo.impl.FileSalesInput;
import com.example.demo.impl.FlatRateDomesticShipping;
import com.example.demo.impl.SummarySalesReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport(){
        return new SummarySalesReport();
        //return new DetailSalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FlatRateDomesticShipping();
    }
}
