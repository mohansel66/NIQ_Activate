package com.niq.assignment.controller;

import com.niq.assignment.model.ProductMetadata;
import com.niq.assignment.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class EcommerceController {

    private final EcommerceService ecommerceService;

    @Autowired
    public EcommerceController(EcommerceService ecommerceService) {
        this.ecommerceService = ecommerceService;
    }


    @GetMapping("/byShopper")
    public ResponseEntity<List<ProductMetadata>> getProducts(
            @RequestParam("shopperId") String shopperId,
            @RequestParam(value = "brand", required = false) String brand,
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "limit", required = false) Integer limt_value) {

        int lim = validateLimit(limt_value);
        Pageable pageable = PageRequest.of(0, lim);
        List<ProductMetadata> filteredProducts = ecommerceService.getFilteredProducts(shopperId, brand, category, pageable);
        return ResponseEntity.ok(filteredProducts);
    }

    private static int validateLimit(Integer limit_value) {
        if(limit_value ==null){
            return 10;
        } else if ((int)limit_value > 100) {
            return 10;
        }else
        {
            return (int)limit_value;
        }
    }

}