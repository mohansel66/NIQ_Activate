package com.niq.assignment.controller;


import com.niq.assignment.model.ProductMetadata;
import com.niq.assignment.service.ProductMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product-metadata")
public class ProductMetadataController {

    @Autowired
    private ProductMetadataService productMetadataService;

    @PostMapping
    public void addProductMetadata(@RequestBody ProductMetadata productMetadata) {
        productMetadataService.addProductMetadata(productMetadata);
    }

}

