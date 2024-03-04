package com.niq.assignment.ServiceImpl;

import com.niq.assignment.model.ProductMetadata;
import com.niq.assignment.repositories.ProductRepository;
import com.niq.assignment.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    private final ProductRepository productRepository;

    @Autowired
    public EcommerceServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductMetadata> getProductsByShopperId(String shopperId) {

        return productRepository.findProductsByShopperId(shopperId);
    }

    @Override
    public List<ProductMetadata> getFilteredProducts(String shopperId, String brand, String category, Pageable pageable) {


        return productRepository.findFilteredProducts(shopperId,brand,category,pageable);
    }


}
