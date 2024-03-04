package com.niq.assignment.service;

import com.niq.assignment.model.ProductMetadata;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface EcommerceService {
    List<ProductMetadata> getProductsByShopperId(String shopperId);

    List<ProductMetadata> getFilteredProducts(String shopperId, String brand, String category, Pageable pageable);
}
