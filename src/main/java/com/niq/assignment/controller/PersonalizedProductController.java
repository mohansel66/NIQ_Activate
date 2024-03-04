package com.niq.assignment.controller;

import com.niq.assignment.model.PersonalizedProduct;
import com.niq.assignment.service.PersonalizedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personalized-products")
public class PersonalizedProductController {

    @Autowired
    private PersonalizedProductService personalizedProductService;

    @PostMapping
    public void ingestPersonalizedProducts(@RequestBody PersonalizedProduct personalizedProduct) {
        personalizedProductService.ingestPersonalizedProducts(personalizedProduct);
    }


}
