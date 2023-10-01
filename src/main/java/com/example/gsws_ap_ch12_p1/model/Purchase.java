package com.example.gsws_ap_ch12_p1.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Purchase {
    private int id;
    private String product;
    private BigDecimal price;
}
