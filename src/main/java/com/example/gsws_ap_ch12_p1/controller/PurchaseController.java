package com.example.gsws_ap_ch12_p1.controller;

import com.example.gsws_ap_ch12_p1.model.Purchase;
import com.example.gsws_ap_ch12_p1.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchase(){
        return purchaseRepository.findAllPurchases();
    }
}
